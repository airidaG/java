
import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int endNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Where from?");
        int startNumber = Integer.parseInt(scanner.nextLine());

        for (int i = startNumber; i <= endNumber; i++) {
            System.out.println(i);
        }
    }
}
