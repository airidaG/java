package predicate_interface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> isEven = val -> val % 2 == 0;

        System.out.println(isEven.test(4));
        System.out.println(isEven.test(7));
    }
}
