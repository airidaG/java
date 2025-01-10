public class Main {
    public static void main(String[] args) {

        oddMultiplicationTable(9);
    }

    public static void oddMultiplicationTable(int number) {

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                int multi = i * j;
                if (multi % 2 != 0) {
                    if (multi < 10) {
                        System.out.print(multi + "   ");
                    } else {
                        System.out.print(multi + "  ");
                    }

                }
            }
            System.out.println();
        }
    }
}