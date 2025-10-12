import java.util.Scanner;
public class Problem08 { // sum of even numbers up to N
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Sum of all even numbers up to " + n + " is " + sum + ".");
    }
}
