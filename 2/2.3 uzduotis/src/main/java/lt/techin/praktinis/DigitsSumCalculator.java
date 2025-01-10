package lt.techin.praktinis;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        // Write your program here

        int sumOfNumbers = 0;

        while (number != 0) {
            int digit = number % 10;
            sumOfNumbers = sumOfNumbers + digit;

            number /= 10;
        }
        System.out.println(sumOfNumbers);
    }
}
