
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

//Reading

//        while (true) {
//            System.out.println("Give numbers:");
//            int number = Integer.parseInt(scanner.nextLine());
//            if (number == -1) {
//                System.out.println("Thx! Bye!");
//                break;
//            }
//        }

//Sum of numbers

//        int sum = 0;
//
//        while (true) {
//            System.out.println("Give numbers:");
//            int number = Integer.parseInt(scanner.nextLine());
//
//            if (number == -1) {
//                System.out.println("Thx! Bye!");
//                System.out.println("Sum: " + sum);
//                break;
//            }
//            sum = sum + number;
//        }

//Sum and number of numbers

//        int sum = 0;
//        int count = 0;
//
//        while (true) {
//            System.out.println("Give numbers:");
//            int number = Integer.parseInt(scanner.nextLine());
//
//            if (number == -1) {
//                System.out.println("Thx! Bye!");
//                System.out.println("Sum: " + sum);
//                System.out.println("Numbers: " + count);
//                break;
//            }
//            sum = sum + number;
//            count++;
//        }

//Average of numbers
//
//        int sum = 0;
//        int count = 0;
//
//
//        while (true) {
//            System.out.println("Give numbers:");
//            int number = Integer.parseInt(scanner.nextLine());
//
//            if (number == -1) {
//                double average = (double) sum / count;
//                System.out.println("Thx! Bye!");
//                System.out.println("Sum: " + sum);
//                System.out.println("Numbers: " + count);
//                System.out.println("Average: " + average);
//                break;
//            }
//            sum = sum + number;
//            count++;
//        }

//Even and odd numbers

        int sum = 0;
        int count = 0;
        int countOfEvenNumbers = 0;
        int countOfOddNumbers = 0;

        while (true) {
            System.out.println("Give numbers:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == -1) {
                double average = (double) sum / count;
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                System.out.println("Average: " + average);
                System.out.println("Even: " + countOfEvenNumbers);
                System.out.println("Odd: " + countOfOddNumbers);
                break;
            }
            if (number % 2 == 0) {
                countOfEvenNumbers++;
            } else {
                countOfOddNumbers++;
            }
            sum = sum + number;
            count++;
        }
    }
}
