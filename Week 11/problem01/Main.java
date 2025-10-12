package problem01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account.aboutBank();

        System.out.print("Enter initial balance for Saving account: ");
        Saving saving = new Saving(sc.nextDouble());

        System.out.print("Enter initial balance for Current account: ");
        Current current = new Current(sc.nextDouble());

        System.out.print("Enter deposit amount for Saving account: ");
        saving.deposit(sc.nextDouble());
        System.out.print("Enter withdrawal amount for Saving account: ");
        saving.withdraw(sc.nextDouble());

        System.out.print("Enter deposit amount for Current account: ");
        current.deposit(sc.nextDouble());
        System.out.print("Enter withdrawal amount for current account: ");
        current.withdraw(sc.nextDouble());

        sc.close();
    }
}
