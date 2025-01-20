import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();

    }

    public void add(double status) {
        this.history.add(status);

    }

    public void clear() {
        this.history.clear();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {

        if (history.isEmpty()) {
            return 0;
        }
        double maxValue = history.get(0);

        for (int i = 0; i < history.size(); i++) {
            if (history.get(i) > maxValue) {
                maxValue = history.get(i);
            }
        }
        return maxValue;
    }

    public double minValue() {

        if (history.isEmpty()) {
            return 0;
        }
        double minValue = history.get(0);

        for (int i = 0; i < history.size(); i++) {
            if (history.get(i) < minValue) {
                minValue = history.get(i);
            }
        }
        return minValue;
    }

    public double average() {

        if (history.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (int i = 0; i < history.size(); i++) {
            sum += history.get(i);
        }

        double average = sum / history.size();
        return average;
    }
}
