
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions

        HealthStation childrenHospital = new HealthStation();

        Person ethan = new Person("Eathan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println(childrenHospital.weighings());

        System.out.println(ethan.getName() + " weight: " + childrenHospital.weigh(ethan) + " kilos");

        childrenHospital.feed(ethan);
        childrenHospital.feed(ethan);
        System.out.println(ethan.getName() + " weight: " + childrenHospital.weigh(ethan) + " kilos");

        System.out.println(childrenHospital.weighings());
    }
}
