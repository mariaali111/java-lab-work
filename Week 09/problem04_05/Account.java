package problem04_05;

public abstract class Account {
    private int id;
    private String accountHolderName;
    private String address;

    public Account(int id, String accountHolderName, String address) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
    }

    public int getId() { return id; }
    public String getAccountHolderName() { return accountHolderName; }
    public String getAddress() { return address; }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void display();
}
