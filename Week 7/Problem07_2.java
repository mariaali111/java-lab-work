package optionalWeek7;

import java.util.Scanner;

public class Problem07_2 { // GCD with recursion
    public static int gcd(int a, int b) {
        if (a % b == 0)
            return b;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("GCD = " + gcd(a,b));
    }
}
