
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {

        Money newMoney = new Money(euros + addition.euros, cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {

        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }

        if (this.euros < compared.euros) {

            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {

        Money newMoney;

        if (euros - decreaser.euros < 0) {
            newMoney = new Money(0, 0);
            return newMoney;
        }
        if (cents - decreaser.cents < 0) {
            newMoney = new Money(euros - decreaser.euros - 1, 100 - decreaser.cents);
            return newMoney;
        }

        newMoney = new Money(euros - decreaser.euros, cents - decreaser.cents);
        return newMoney;
    }

}
