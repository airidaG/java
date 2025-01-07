
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String word = scan.nextLine();
        System.out.println("Give an integer:");
        int numberInt = Integer.parseInt(scan.nextLine());
        System.out.println("Give a double:");
        double numberDouble = Double.parseDouble(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean state = Boolean.parseBoolean(scan.nextLine());

        System.out.println("You gave the string " + word);
        System.out.println("You gave the integer " + numberInt);
        System.out.println("You gave the double " + numberDouble);
        System.out.println("You gave the boolean " + state);
    }
}
