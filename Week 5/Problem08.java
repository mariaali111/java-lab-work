import java.util.Scanner;

public class Problem08 { // reverse
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("integer: ");
        int n = sc.nextInt();
        int reverse = 0;

        while (n > 0) {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        System.out.println("reverse: " + reverse);
    }
}
