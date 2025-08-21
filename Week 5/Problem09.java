import java.util.Scanner;

public class Problem09 { // palindrome
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;

        while (n > 0) {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }

        if (reverse == original)
            System.out.println(original + " is a palindrome.");
        else System.out.println(original + " is not a palindrome.");
    }
}
