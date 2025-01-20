import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here

//        Person ada = new Person("Ada Lovelace", "24 Maddox St. London WIS 2QN");
//        Person esko = new Person("Esko Ukkonen", "Some street 15 Helsinki");
//
//        System.out.println(ada);
//        System.out.println(esko);


//        Student ada = new Student("Ada Lovelace", "24 Maddox St. London WIS 2QN");
//        Teacher esko = new Teacher("Esko Ukkonen", "Some street 15 Helsinki", 1200);
//
//        System.out.println(ada);
//
//        ada.study();
//        ada.study();
//        System.out.println(ada.credits());
//        System.out.println(esko);

        ArrayList<Person> persons = new ArrayList<Person>();

        persons.add(new Teacher("Esko Ukkonen", "Some street 15 Helsinki", 1200));
        persons.add(new Student("Ada Lovelace", "24 Maddox St. London WIS 2QN"));

        printPersons(persons);

    }

    public static void printPersons(ArrayList<Person> persons){

        for (int i = 0; i < persons.size(); i++){
            System.out.println(persons.get(i));
        }


    }

}
