import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> inputArr = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;

            }
            inputArr.add(input);
        }
        inputArr.stream()
                .forEach((element) -> System.out.println(element));
    }
}
