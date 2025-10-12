package problem04_05;

public class Current extends Account{
    private double balance;
    private double maxWithdrawalLimit;

    public Current(int id, String accountHolderName, String address, double balance, double maxWithdrawalLimit) {
        super(id, accountHolderName, address);
        this.balance = balance;
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }
    public void withdraw(double amount) {
        if (amount <= maxWithdrawalLimit) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        } else
            System.out.println("Cannot withdraw! Maximum withdrawal limit: " + maxWithdrawalLimit);
    }
    public void display() {
        System.out.println("Current Account");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getAccountHolderName());
        System.out.println("Address: " + getAddress());
        System.out.println("Balance: " + balance);
        System.out.println("Maximum Withdrawal Limit: " + maxWithdrawalLimit);
        System.out.println();
    }
}
