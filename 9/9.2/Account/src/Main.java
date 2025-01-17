public class Main {
    public static void main(String[] args) {

        Account myAccount = new Account(1122, 20000);
//        myAccount.setAnnualInterestRate(4.5);
//
//        System.out.println(myAccount.getBalance());
//        myAccount.withdraw(2500);
//        System.out.println(myAccount.getBalance());
//        myAccount.deposit(3000);
//
//        System.out.println(myAccount.getBalance());
//        System.out.println(myAccount.getMonthlyInterest());
//        System.out.println(myAccount.getDateCreated());
//
        System.out.println(myAccount);

        CheckingAccount check = new CheckingAccount(2514, 35000, 500);
        System.out.println(check);

        check.withdraw(4000);
        System.out.println(check);
        SavingAccount save = new SavingAccount(1199, 50000);
        System.out.println(save);
        save.withdraw(50001);
        System.out.println(save);

    }
}