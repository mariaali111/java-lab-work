package problem02;

public class Current implements Account {
    private double balance;

    public Current(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " New balance: " + balance);
    }
}
