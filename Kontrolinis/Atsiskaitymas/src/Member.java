public class Member {

    private int id;
    private String name;
    private int age;


    public Member(int id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return id +
                ": " + name +
                ", Age: " + age;
    }

    public String getName() {
        return name;
    }
}
