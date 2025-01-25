import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> owsMap = new HashMap<>();

    public IOU() {


    }

    public void setSum(String toWhom, double amount) {

        owsMap.put(toWhom, amount);


    }

    public double howMuchDoIOweTo(String toWhom) {

        if (owsMap.containsKey(toWhom)) {
            return owsMap.get(toWhom);
        }
        return 0;
    }
}
