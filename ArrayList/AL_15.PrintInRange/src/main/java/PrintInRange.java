
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        // Try your method here
        printNumbersInRange(numbers, 0, 5);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {

        System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit + "]");

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) <= upperLimit && numbers.get(i) >= lowerLimit) {
                System.out.println(numbers.get(i));
            }
        }

    }
}
