import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Account {

    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated = LocalDate.now();
    private ArrayList<Transaction> transactions = new ArrayList<>();


    public Account() {

    }


    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }


    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }


    public int getId() {
        return id;
    }


    public double getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    public LocalDate getDateCreated() {
        return dateCreated;
    }


    public double getMonthlyInterestRate() {

        return annualInterestRate / 12;
    }


    public double getMonthlyInterest() {

        return balance * getMonthlyInterestRate();
    }


    public void withdraw(double amount) {

        balance -= amount;

        Transaction newTransaction = new Transaction('w', amount, balance, "Withdrawal");
        transactions.add(newTransaction);

    }


    public void deposit(double amount) {

        balance += amount;

        Transaction newTransaction = new Transaction('d', amount, balance, "Deposit");
        transactions.add(newTransaction);
    }

    @Override
    public String toString() {
        return "Account " +
                "name: " + name +
                ", id: " + id +
                ", balance: " + balance +
                ", annualInterestRate: " + annualInterestRate +
                ", dateCreated: " + dateCreated + transactions;
    }

    public void printTransactions() {

        for(int i = 0 ; i < transactions.size() ; i++) {
            System.out.println(transactions.get(i));
        }
    }
}
