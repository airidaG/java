public class Organism implements Movable {


    private int x;
    private int y;

    @Override
    public void move(int dx, int dy) {

        x += dx;
        y += dy;

    }

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x +
                "; y: " + y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
