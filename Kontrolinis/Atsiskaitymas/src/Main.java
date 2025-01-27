public class Main {
    public static void main(String[] args) {

//Member class:
//        Member freshMember = new Member(18, "Jurgis", 60);
//        System.out.println(freshMember);

//Membership class:

//        Membership membership = new Membership(5, 9);

//MonthlyMembership class:

//        Membership membership = new MonthlyMembership(9, 18, 8);
//        System.out.println(membership);

//AnnualMembership class:

//        Membership yearlyMembership = new AnnualMembership(70, 82);
//        System.out.println(yearlyMembership);

//GymClass class:
//
//        GymClass pilates = new GymClass("Pilates", "Tuesday 7PM");
//        System.out.println(pilates);
//
//        pilates.enroll(new Member(157, "Michael", 55));
//        System.out.println(pilates);
//
//        pilates.enroll(new Member(28, "Ernesto", 81));
//        System.out.println(pilates);
//
//        GymClass yoga = new GymClass("Yoga", "Friday 9AM");
//        yoga.enroll(new Member(78, "Jeffery", 54));
//
//        System.out.println(yoga);

//Gym class:
//
        Gym gym = new Gym();

        gym.addMember(1, "Alice", 30);
        gym.addMember(2, "Bob", 25);
        gym.addMember(3, "Jeff", 58);

        gym.printMembers();
        System.out.println("---");

        gym.assignMembership(new MonthlyMembership(1, 1, 2));
        gym.assignMembership(new AnnualMembership(2, 2));
        gym.assignMembership(new MonthlyMembership(3, 3, 6));

        gym.printMemberships();
        System.out.println("---");

        gym.addGymClass("Yoga", "Monday 6 PM");
        gym.addGymClass("Zumba", "Wednesday 7 PM");

        gym.enrollMemberInClass(1, "Yoga");
        gym.enrollMemberInClass(2, "Zumba");
        gym.enrollMemberInClass(3, "Yoga");

        gym.printClassEnrollments();
    }
}