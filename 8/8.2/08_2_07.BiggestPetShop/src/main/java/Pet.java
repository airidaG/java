
public class Pet {

    private static String name;
    private static String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public static String getName() {
        return name;
    }

    public static String getBreed() {
        return breed;
    }

}
