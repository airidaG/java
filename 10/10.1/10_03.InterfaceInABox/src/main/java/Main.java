
public class Main {

    public static void main(String[] args) {
        // test your classes here

        Book book1 = new Book("Some author", "Some name", 2);
        Book book2 = new Book("Some next author", "Some next name", 8);
        Book book3 = new Book("Another author", "Another name", 0.5);

        CD cd1 = new CD("Some artist", "Some name", 1998);
        CD cd2 = new CD("Some next artist", "Some next name", 2098);
        CD cd3 = new CD("Another artist", "Another name", 2001);

        System.out.println(book1);
        System.out.println(cd1);


    }

}
