import java.time.LocalDate;
import java.util.Date;

public class Transaction {

    private LocalDate transactionDate = LocalDate.now();
    private char type;
    private double amount;
    private double balance;
    private String description;


    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;

    }

    public void setType(char type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Transaction " +
                "transactionDate: " + transactionDate +
                ", type: " + type +
                ", amount: " + amount +
                ", balance: " + balance +
                ", description: '" + description + '\'';
    }
}
