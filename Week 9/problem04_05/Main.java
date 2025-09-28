package problem04_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID, account holder name, address, balance and minimum balance:");
        int id1 = sc.nextInt();
        sc.nextLine();
        String n1 = sc.nextLine();
        String a1 = sc.nextLine();
        double b1 = sc.nextDouble();
        double minBalance = sc.nextDouble();

        Saving sAcc = new Saving(id1, n1, a1, b1, minBalance);
        sAcc.display();

        System.out.print("Enter the amount to be deposited: ");
        sAcc.deposit(sc.nextDouble());
        System.out.println();

        System.out.print("Enter the amount to be withdrawn: ");
        sAcc.withdraw(sc.nextDouble());
        System.out.println();

        System.out.println("Enter ID, account holder name, address, balance and max withdrawal limit:");
        int id2 = sc.nextInt();
        sc.nextLine();
        String n2 = sc.nextLine();
        String a2 = sc.nextLine();
        double b2 = sc.nextDouble();
        double maxWithLim = sc.nextDouble();

        Current cAcc = new Current(id2, n2, a2, b2, maxWithLim);
        cAcc.display();

        System.out.print("Enter the amount to be deposited: ");
        sAcc.deposit(sc.nextDouble());
        System.out.println();

        System.out.print("Enter the amount to be withdrawn: ");
        sAcc.withdraw(sc.nextDouble());
    }
}
