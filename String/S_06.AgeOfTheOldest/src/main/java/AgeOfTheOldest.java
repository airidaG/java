
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;

        while (true) {
            String nameAndAge = scanner.nextLine();

            if (nameAndAge.isEmpty()) {
                break;
            }

            String[] pieces = nameAndAge.split(",");
            int age = Integer.parseInt(pieces[1]);

            if (age > oldestAge) {
                oldestAge = age;
            }
        }
        System.out.println("Age of the oldest: " + oldestAge);
    }
}
