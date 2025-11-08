import java.util.Scanner;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal denied: Not enough balance!");
        }
        balance -= amount;
        System.out.println("Amount withdrawn: " + amount + ", Remaining balance: " + balance);
    }
}

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the bank balance: ");
        BankAccount acc = new BankAccount(sc.nextDouble());

        try {
            System.out.print("Enter the amount to withdraw: ");
            acc.withdraw(sc.nextDouble());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
