public class SavingAccount extends Account {

    public SavingAccount(int id, double balance) {
        super(id, balance);
    }


    @Override
    public void withdraw(double amount) {

        if (getBalance() - amount < 0) {
            System.out.println("Insufficient funds!");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw successful!");
        }
        Transaction newTransaction = new Transaction('w', amount, getBalance(), "Withdrawal");
        getTransactions().add(newTransaction);
    }
}
