public class Main {
    public static void main(String[] args) {

        System.out.println(calculateDistance(6, 0, 8, 4));
    }

    public static double calculateDistance(int x1, int y1, int x2, int y2) {

        int distance = (int) Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

        return distance;
    }
}