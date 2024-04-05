public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private String accountEmail;
    private int accountPhone;
    private double balance;




    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to " + accountHolderName);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " to " + accountHolderName);
        } else {
            System.out.println("insufficient fund");
        }
    }

    public double getBalance() {
        return balance;
    }
}
