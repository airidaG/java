import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> list = new ArrayList<>();


    @Override
    public void add(Item item) {

        if (item.getWeight() <= capacity) {
            capacity -= item.getWeight();

            list.add(item);
        }

    }

    @Override
    public boolean isInBox(Item item) {


        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getName().equals(item.getName())) {
                return true;

            }
        }
        return false;
    }


    public BoxWithMaxWeight(int capacity) {

        this.capacity = capacity;

    }

}
