package BankAccount;

public class BankAccount {

    private String accountNumber;
    private double balance = 0.0;
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public void withdraw(double amount) throws BalanceException {
         if (balance < amount)
         {
            throw new BalanceException();
         }
            balance -= amount;
    }

    public void printAccountInfo() {
        System.out.println("Account Number: " + accountNumber + "\nBalance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("12345");

        bankAccount.deposit(10);

        bankAccount.printAccountInfo();

        try {
            bankAccount.withdraw(11);
        } catch (BalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            bankAccount.printAccountInfo();
        }
    }
}
