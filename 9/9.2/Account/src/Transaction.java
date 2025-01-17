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

    
}
