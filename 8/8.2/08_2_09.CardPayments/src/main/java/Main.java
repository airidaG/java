
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here

        PaymentTerminal unicafe = new PaymentTerminal();

        double change = unicafe.eatAffordably(10);
        System.out.println("remaining change: " + change);

        PaymentCard annesCard = new PaymentCard(7);

        boolean wasSuccessful = unicafe.eatHeartily(annesCard);
        System.out.println(annesCard.balance());
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafe.eatHeartily(annesCard);
        System.out.println(annesCard.balance());
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafe.eatAffordably(annesCard);
        System.out.println(annesCard.balance());
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println(unicafe);
    }
}

