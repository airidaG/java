import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles:");
//        double miles = Double.parseDouble(scanner.nextLine());
        int miles = Integer.parseInt(scanner.nextLine());

        double kilometers = (double) miles * 1.609;

        System.out.println(miles + " miles is " + kilometers + " kilometers");


    }
}
