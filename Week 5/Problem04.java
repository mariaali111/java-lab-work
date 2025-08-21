import java.util.Scanner;

public class Problem04 { // sum of the series
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 + 1/2 + 1/3 + 1/4 + ... + 1/n");
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Sum = " + sum);
    }
}
