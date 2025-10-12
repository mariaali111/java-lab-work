package problem02;

public interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    static void aboutBank() {
        System.out.println("Welcome to Indian Bank!\n");
    }
    default void takeLoan(double amount) {
        System.out.println("Not available here!");
    }
}
