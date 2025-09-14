package optionalWeek7;

import java.util.Scanner;

public class Problem07_1 { // GCD without recursion
    public static void gcd(int a, int b) {
        while (true) {
            int r = a % b;
            if (r == 0) {
                System.out.print("GCD = " + b);
                break;
            }
            else {
                a = b;
                b = r;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        gcd(a,b);
    }
}
