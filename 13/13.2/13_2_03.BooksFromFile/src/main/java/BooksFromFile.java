import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class BooksFromFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // test your method here

//        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        String filePath = "C:\\Users\\D3PT\\Desktop\\java\\13\\13.2\\13_2_03.BooksFromFile\\src\\main\\java\\books.txt";

        System.out.println(readBooks(filePath).toString());
    }

    public static List<Book> readBooks(String file) throws IOException {

        List<Book> data = Files.lines(Paths.get(file))
                .map(line -> {
                    String[] array = line.split(",");
                    return new Book(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2]), array[3]);
                })
                .collect(Collectors.toList());

        return data;

    }
}
