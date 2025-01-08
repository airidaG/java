
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int totalOfNumbers = 0;

        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            sumOfNumbers = sumOfNumbers + number;
            if (number == 0) {
                System.out.println("Number of numbers: " + totalOfNumbers);
                System.out.println("Sum of the numbers: " + sumOfNumbers);
                break;
            } else {
                totalOfNumbers++;
            }
        }

    }
}
