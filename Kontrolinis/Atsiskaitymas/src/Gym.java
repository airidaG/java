import java.util.ArrayList;
import java.util.HashMap;

public class Gym {

    private HashMap<Integer, Member> members = new HashMap<>();
    private ArrayList<Membership> memberships = new ArrayList<>();
    private HashMap<String, GymClass> gymClasses = new HashMap<>();


    public void addMember(int num, String name, int age) {
        members.put(num, new Member(num, name, age));
    }

    public void printMembers() {
        System.out.println("Members:");
        members.forEach((k, v) -> System.out.println(v));
    }

    public void assignMembership(Membership membership) {
        memberships.add(membership);
    }

    public void printMemberships() {
        System.out.println("Memberships:");
        memberships.forEach(System.out::println);
    }

    public void addGymClass(String className, String schedule) {
        gymClasses.put(className, new GymClass(className, schedule));

    }

    public void enrollMemberInClass(int memberId, String className) {

        if (!members.containsKey(memberId)) {
            System.out.println("Member Id not found.");
            return;
        }


        if (!gymClasses.containsKey(className)) {
            System.out.println("Class not found.");
            return;
        }

        gymClasses.get(className).enroll(members.get(memberId));

    }

    public void printClassEnrollments() {

        System.out.println("Class Enrollments:");
        gymClasses.forEach((k, v) -> System.out.println(v));

    }
}
