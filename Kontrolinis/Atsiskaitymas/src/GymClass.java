import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GymClass {

    private String className;
    private String schedule;
    private ArrayList<Member> enrolledMembers = new ArrayList<>();


    public GymClass(String className, String schedule) {
        this.className = className;
        this.schedule = schedule;
    }

    public void enroll(Member member) {
        enrolledMembers.add(member);
    }

    @Override
    public String toString() {

        List<String> names = enrolledMembers.stream()
                .map(Member::getName)
                .toList();

        String result = Arrays.toString(names.toArray())
                .replace("[]", "")
                .replace("[", "")
                .replace("]", "");

        if (result.isEmpty()) {
            return className +
                    " (" + schedule +
                    ") " + result;
        }
        return className +
                " (" + schedule +
                "): " + result;
    }

}
