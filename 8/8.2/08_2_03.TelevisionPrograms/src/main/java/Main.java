import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name:");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Duration:");
            int duration = Integer.parseInt(scanner.nextLine());

            TelevisionProgram newProgram = new TelevisionProgram(name, duration);

            programs.add(newProgram);
        }

        System.out.println("Program's maximum duration?");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < programs.size(); i++) {
            if (programs.get(i).getDuration() <= maxDuration) {
                System.out.println(programs.get(i));
            }
        }

    }
}
