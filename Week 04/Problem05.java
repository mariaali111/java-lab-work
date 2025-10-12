import java.util.Scanner;
public class Problem05 { // divide by 2 until less than 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        while (n > 10) {
            n /= 2;
            System.out.println(n);
        }
    }
}
