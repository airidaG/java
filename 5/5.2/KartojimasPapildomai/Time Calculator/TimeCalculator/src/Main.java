public class Main {
    public static void main(String[] args) {

        System.out.println(minutesToTime(1950));
    }

    public static String minutesToTime(int minutes) {

        int hours = minutes / 60;

        return hours + " hours and " + minutes % 60 + " minutes";
    }
}