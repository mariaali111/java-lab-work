package problem01;

public interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    static void aboutBank() {
        System.out.println("Welcome to Indian Bank!");
    }
}
