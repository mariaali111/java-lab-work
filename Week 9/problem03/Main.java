package problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID, account holder name, address and balance:");
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String address = sc.nextLine();
        double balance = sc.nextDouble();

        Account acc = new Account(id, name, address, balance);
        acc.displayAccountInfo();

        System.out.println("Enter the amount to deposit:");
        acc.deposit(sc.nextDouble());

        System.out.println("Enter the amount to withdraw:");
        acc.withdraw(sc.nextDouble());

        System.out.println("Enter the principal, rate and time for Simple Interest:");
        double si = Account.calculateSimpleInterest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Simple Interest: " + si);
        System.out.println();

        System.out.println("Enter the principal, rate, time and repetition for Compound Interest:");
        double ci = Account.calculateCompoundInterest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextInt());
        System.out.println("Compound Interest: " + ci);
    }
}
