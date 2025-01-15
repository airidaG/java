
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {

    }

    public void addNumber(int number) {
        sum += number;
        count++;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {

        double average = 0;
        if (sum != 0) {
            average = (double) sum / count;
        }
        return average;
    }

}
