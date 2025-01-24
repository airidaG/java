import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!

        HashMap<String, String> people = new HashMap<>();

        people.put("matthew", "matt");
        people.put("michael", "mix");
        people.put("arthur", "artie");

        String matthewNickname = people.get("matthew");
        System.out.println(matthewNickname);
    }

}
