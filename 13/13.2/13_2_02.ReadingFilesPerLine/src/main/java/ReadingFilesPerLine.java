
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // test the method here

        String filePath = "C:\\Users\\D3PT\\Desktop\\java\\13\\13.2\\13_2_02.ReadingFilesPerLine\\src\\main\\java\\file.txt";
        List<String> words = read(filePath);
        System.out.println(words);

//        System.out.println("Current working directory: " + System.getProperty("user.dir"));


    }

    public static List<String> read(String file) throws IOException {

        return Files.lines(Paths.get(file))
                .collect(Collectors.toList());
    }

}
