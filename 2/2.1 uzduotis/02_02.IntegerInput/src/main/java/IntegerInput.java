
import java.sql.SQLOutput;
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int numberInt = Integer.parseInt(scanner.nextLine());
        System.out.println("You gave the number " + numberInt);
    }
}
