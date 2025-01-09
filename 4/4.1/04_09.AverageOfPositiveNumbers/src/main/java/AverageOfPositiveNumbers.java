
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int total = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                if (total <= 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                double average = (double) sum / total;
                System.out.println(average);
                break;
            } else if (number > 0) {
                total++;
                sum = sum + number;
            }
        }
    }
}
