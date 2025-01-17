
public class Main {

    public static void main(String[] args) {
        // test your program here!

        SimpleDate date = new SimpleDate(13, 2, 2015);
        SimpleDate nextDate = new SimpleDate(30, 5, 1998);

        date.advance(20);
        System.out.println(date);

        SimpleDate newDate = nextDate.afterNumberOfDays(7);
        System.out.println(date);
        System.out.println(nextDate);
        System.out.println(newDate);

    }
}
