
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        System.out.println("From where?");
        int firstIndex = Integer.parseInt(scanner.nextLine());
        System.out.println("To where?");
        int secondIndex = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= secondIndex; i++) {
            if (i < firstIndex) {
                continue;
            }
            System.out.println(numbers.get(i));
        }

    }
}
