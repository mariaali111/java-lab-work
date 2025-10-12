package problem04_05;

public class Saving extends Account{
    private double balance;
    private double minBalance;

    public Saving(int id, String accountHolderName, String address, double balance, double minBalance) {
        super(id, accountHolderName, address);
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }
    public void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        } else
            System.out.println("Cannot withdraw! Minimum balance requirement: " + minBalance);
    }
    public void display() {
        System.out.println("Saving Account");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getAccountHolderName());
        System.out.println("Address: " + getAddress());
        System.out.println("Balance: " + balance);
        System.out.println("Minimum Balance: " + minBalance);
        System.out.println();
    }
}
