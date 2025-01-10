public class Main {
    public static void main(String[] args) {

        System.out.println("Multiplication Table");
        System.out.print("   ");

        for (int num = 1; num <= 9; num++) {
            System.out.print("   " + num + " ");
        }
        System.out.println();

        for (int line = 1; line <= 48; line++) {
            System.out.print("-");
        }
        System.out.println();


        for (int row = 1; row <= 9; row++) {
            for (int coll = 1; coll <= 9; coll++) {
                if (coll == 1) {
                    System.out.print(row + " | ");
                }
                if (row * coll < 10) {
                    System.out.print("  " + row * coll + "  ");
                } else {
                    System.out.print(" " + row * coll + "  ");
                }

                if (coll == 9) {
                    System.out.println();
                }

            }
        }
    }
}