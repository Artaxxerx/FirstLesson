package BankAccount;

public class BalanceException extends Exception {
    public String getMessage() {
        return "Лимит баланса превышен";
    }
}
