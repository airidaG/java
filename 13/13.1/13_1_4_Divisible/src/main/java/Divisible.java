import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 2, -17, -5, 7));

        ArrayList<Integer> divisible = divisible(numbers);
        
        divisible.stream()
                .forEach(num -> System.out.println(num));

    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {

        List<Integer> divisible = numbers.stream()
                .filter(number -> number % 2 == 0 || number % 3 == 0 || number % 5 == 0)
                .collect(Collectors.toList());

        return new ArrayList<>(divisible);
    }

}
