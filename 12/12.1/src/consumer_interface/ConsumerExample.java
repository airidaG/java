package consumer_interface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> printMessage = val -> System.out.println(val + " is awesome!");

        printMessage.accept("Java");
    }
}
