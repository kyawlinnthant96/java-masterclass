public class BankAccount {
    private String accountName;
    private double balance;
    private int accountNumber;
    private String accountEmail;

    public BankAccount(String accountName, double balance, int accountNumber, String accountEmail) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountEmail = accountEmail;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
