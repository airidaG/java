
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int total = 0;
        String longestName = "";

        while (true) {
            String nameAndYear = scanner.nextLine();

            if (nameAndYear.isEmpty()) {
                System.out.println("Longest name: " + longestName);
                System.out.println("Average of the birth year: " + (double) total / count);
                break;
            }

            String[] pieces = nameAndYear.split(",");
            String name = pieces[0];

            if (name.length() > longestName.length()) {
                longestName = name;
            }

            int years = Integer.parseInt(pieces[1]);
            total += years;
            count++;

        }


    }
}
