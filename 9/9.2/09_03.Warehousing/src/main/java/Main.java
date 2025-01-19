

public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes

        ProductWarehouse juices = new ProductWarehouse("Juice", 1000);

        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 10);

//        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        System.out.println(juice);

        ChangeHistory ch = new ChangeHistory();
        ch.add(99);
        ch.average();


    }

}
