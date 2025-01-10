public class Main {
    public static void main(String[] args) {

        System.out.println(countDivisors(12));
    }

    public static int countDivisors(int number) {

        int numberOfDivisors = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                numberOfDivisors++;
            }
        }
        return numberOfDivisors;
    }
}