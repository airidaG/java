
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);

    }
}
