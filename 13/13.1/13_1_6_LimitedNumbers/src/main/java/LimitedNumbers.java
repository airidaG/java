import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> inputArr = new ArrayList<>();

        while (true) {
            Integer input = Integer.parseInt(scanner.nextLine());

            if (input < 0) {
                break;

            }
            inputArr.add(input);
        }
        inputArr.stream()
                .filter(num -> num >= 1 && num <= 5)
                .forEach((element) -> System.out.println(element));
    }

}

