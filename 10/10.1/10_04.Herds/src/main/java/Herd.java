import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> herd = new ArrayList<>();


    @Override
    public void move(int dx, int dy) {

        for (int i = 0; i < herd.size(); i++) {

            Movable movable = herd.get(i);
            movable.move(dx, dy);
        }

//        for(Movable movable : herd){
//            movable.move(dx, dy);
//        }

    }

    @Override
    public String toString() {

        String result = "";
        for (Movable movable : herd) {
            result += movable.toString() + "\n";
        }

        return result;
    }

    public void addToHerd(Movable movable) {

        herd.add(movable);

    }
}

