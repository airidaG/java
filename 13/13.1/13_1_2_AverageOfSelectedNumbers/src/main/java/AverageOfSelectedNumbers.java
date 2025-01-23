import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Implement your program here

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            numbers.add(Integer.parseInt(input));
        }
        System.out.println("Print the average of the negative numbers or positive numbers? (n/p)");
        String answer = scanner.nextLine();

        if (answer.equals("n")) {
            double averageOfNegativeNumbers = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .filter(number -> number < 0)
                    .average()
                    .orElse(0.0);
            System.out.println("Average of the negative numbers: " + averageOfNegativeNumbers);
            
        } else if (answer.equals("p")) {
            double averageOfPositiveNumbers = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .filter(number -> number > 0)
                    .average()
                    .orElse(0.0);
            System.out.println("Average of the positive numbers: " + averageOfPositiveNumbers);
        }
    }
}
