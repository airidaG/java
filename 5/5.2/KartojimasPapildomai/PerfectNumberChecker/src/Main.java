public class Main {
    public static void main(String[] args) {

        System.out.println(isPerfect(496));

    }

    public static boolean isPerfect(int number) {

        int numberOfDivisors = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                if (i == number) {
                    break;
                }
                numberOfDivisors += i;
            }
        }
        return numberOfDivisors == number;
    }
}