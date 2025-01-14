
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String nameOfOldest = "";

        while (true) {
            String nameAndAge = scanner.nextLine();

            if (nameAndAge.isEmpty()) {
                break;
            }

            String[] pieces = nameAndAge.split(",");
            String names = pieces[0];
            int age = Integer.parseInt(pieces[1]);

            if (age > oldestAge) {
                oldestAge = age;
                nameOfOldest = names;
            }
        }
        System.out.println("Name of the oldest: " + nameOfOldest);

    }
}
