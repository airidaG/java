package supplier_interface;

import java.sql.Array;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.Random;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<String> randomGreeting = () -> {

            String[] greetings = {"Hello", "Hi", "Hey!", "Hey, how are you?"};
            Random random = new Random();
            int index = random.nextInt(greetings.length);
            return greetings[index];
        };

        System.out.println(randomGreeting.get());
    }
}
