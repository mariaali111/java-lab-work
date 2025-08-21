import java.util.Scanner;

public class Problem05 { // sum of the digits of an integer
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int og = n;
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of the digits of " + og + " is " + sum + ".");
    }
}
