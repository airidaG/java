package lt.techin.praktinis;

public class NumberReverter {
    public void revert(int number) {
        // Write your program here

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;

            number /= 10;
        }
        System.out.println(reversed);
    }

}
