public class Main {
    public static void main(String[] args) {

        System.out.println(calculatePower(2, 7));
    }

    public static int calculatePower(int base, int exponent) {

        int test = 1;

        for (int i = 1; i <= exponent; i++) {
            test = test * base;
        }
        return test;
    }
}