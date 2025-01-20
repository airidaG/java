import java.util.ArrayList;

public class Box implements Packable {


    private double capacity;
    private ArrayList<Packable> box = new ArrayList<>();

    public Box(double capacity) {

        this.capacity = capacity;
    }

    public void add(Packable packable) {

        if (packable.weight() <= capacity) {
            capacity -= packable.weight();
            box.add(packable);
        }
    }

    @Override
    public double weight() {

        double totalBoxWeight = 0;

        for (int i = 0; i < box.size(); i++) {

            totalBoxWeight += box.get(i).weight();
        }
        return totalBoxWeight;
    }

    @Override
    public String toString() {
        return "Box: " + box.size() + " items, total weight " + weight() + " kg";
    }
}
