public class Main {
    public static void main(String[] args) {

        System.out.println(digitSum(11111));

    }

    public static int digitSum(int number) {

        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }
}