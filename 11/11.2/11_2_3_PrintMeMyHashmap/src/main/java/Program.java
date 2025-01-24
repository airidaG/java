import java.util.HashMap;

public class Program {

    public static void main(String[] args) {


        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("e.g", "for example");
        hashmap.put("etc", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");

        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    public static void printKeys(HashMap<String, String> hashmap) {

        hashmap.forEach((k, v) -> System.out.println(k));
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {

        hashmap.forEach((k, v) -> {
            if (k.contains(text)) {
                System.out.println(k);
            }
        });
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {

        hashmap.forEach((k, v) -> {
            if (k.contains(text)) {
                System.out.println(v);
            }
        });

    }

}
