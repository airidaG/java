
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int total = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;
            if (number == 0) {
                double average = (double) sum / total;
                System.out.println("Average of the numbers: " + average);
                break;
            } else {
                total++;
            }
        }
    }
}
