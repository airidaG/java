import java.util.ArrayList;

public class MisplacingBox extends Box {

    private ArrayList<Item> list = new ArrayList<>();

    @Override
    public void add(Item item) {
        list.add(item);

    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }

    public MisplacingBox() {

    }
}
