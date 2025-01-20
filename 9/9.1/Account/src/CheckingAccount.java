public class CheckingAccount extends Account {

    private double overdraftLimit;


    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;

    }

    @Override
    public String toString() {
        return super.toString() +
                " overdraftLimit: " + overdraftLimit;
    }


    @Override
    public void withdraw(double amount) {

        if (getBalance() - amount < overdraftLimit) {
            System.out.println("Insufficient funds!");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw successful!");
        }
        Transaction newTransaction = new Transaction('w', amount, getBalance(), "Withdrawal");
        getTransactions().add(newTransaction);

    }
}
