import java.util.Scanner;

public class YearFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");

        long minutes = Long.parseLong(scanner.nextLine());
        long years = minutes / 525600;
        long remainingMinutes = minutes % 525600;
        long day = remainingMinutes / 1440;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + day + " days");


//


    }
}