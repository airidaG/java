
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }

    }
}
