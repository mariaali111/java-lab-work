package problem03;

public class Account {
    private int id;
    private String accountHolderName;
    private String address;
    private double balance;

    public Account(int id, String accountHolderName, String address, double initialBalance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New balance: " + balance);
            System.out.println();
        }
        else System.out.println("Invalid amount!");
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New balance: " + balance);
            System.out.println();
        }
        else System.out.println("Insufficient balance or invalid amount!");
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    public static double calculateCompoundInterest(double principal, double rate, double time, int n) {
        // n = number of times interest applied per time period
        return (principal * Math.pow(1 + (rate / (100 * n)), n * time) - principal);
    }

    public void displayAccountInfo() {
        System.out.println("Account id: " + id);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}
