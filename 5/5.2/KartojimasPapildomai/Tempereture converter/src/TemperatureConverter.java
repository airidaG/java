import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter temperature in celsius: ");
        double celsius = Double.parseDouble(scan.nextLine());
        System.out.println(convertTemp(celsius));

    }

    public static String convertTemp(double celsius) {

        double fahrenheit = (celsius * 1.8) + 32;

        String answer = celsius + "°C " + "is equal to " + fahrenheit + "°F";

        return answer;
    }
}

