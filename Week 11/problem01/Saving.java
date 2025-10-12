package problem01;

public class Saving implements Account{
    private double balance;

    public Saving(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " New balance: " + balance);
        } else System.out.println("Insufficient balance!");
    }
}
