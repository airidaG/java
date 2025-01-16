import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year:");
            int year = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, pages, year);
            bookList.add(book);

        }

        System.out.println("What information will be printed?");
        String whatToPrint = scanner.nextLine();

        for (int i = 0; i < bookList.size(); i++) {

            if (whatToPrint.equals("everything")) {
                System.out.println(bookList.get(i).toString());
            }

            if (whatToPrint.equals("name")) {
                System.out.println(bookList.get(i).getName());
            }
        }
    }
}
