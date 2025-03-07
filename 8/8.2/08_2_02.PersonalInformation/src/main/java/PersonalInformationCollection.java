
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name:");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.println("Last name:");
            String lastName = scanner.nextLine();
            System.out.println("Identification number:");
            String identificationNr = scanner.nextLine();

            PersonalInformation item = new PersonalInformation(firstName, lastName, identificationNr);

            infoCollection.add(item);

        }

        for (int i = 0; i < infoCollection.size(); i++) {

            System.out.println(infoCollection.get(i).getFirstName() + " " + infoCollection.get(i).getLastName());
        }

    }
}
