package problem08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the brand and power of the Washing Machine:");
        String n1 = sc.nextLine();
        int p1 = sc.nextInt();
        sc.nextLine();
        WashingMachine wm = new WashingMachine(n1, p1);

        System.out.println("Enter the brand and power of the Refrigerator:");
        String n2 = sc.nextLine();
        int p2 = sc.nextInt();
        sc.nextLine();
        Refrigerator r = new Refrigerator(n2, p2);

        wm.turnOn();
        wm.turnOff();

        r.turnOn();
        r.turnOff();
    }
}
