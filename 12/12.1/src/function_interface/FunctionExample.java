package function_interface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<Integer, String> intToString = val -> "Value: " + val;

        System.out.println(intToString.apply(5));
    }
}