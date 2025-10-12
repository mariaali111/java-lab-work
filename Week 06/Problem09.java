import java.util.Scanner;

public class Problem09 { // Fibonacci series
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci series:");
        int first = 0;
        int second = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(first + " ");
                continue;
            }
            if (i == 1) {
                System.out.print(second + " ");
                continue;
            }
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
