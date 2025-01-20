import java.util.ArrayList;

public class OneItemBox extends Box {

    private int capacity;
    private ArrayList<Item> list = new ArrayList<>();

    @Override
    public void add(Item item) {

        if (list.size() < capacity) {

            list.add(item);
        }

    }

    @Override
    public boolean isInBox(Item item) {


        if (!list.isEmpty()) {

            if (list.get(0).getName().equals(item.getName())) {
                return true;
            }

        }
        return false;

    }

    public OneItemBox() {
        capacity = 1;
    }
}
