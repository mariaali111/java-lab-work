import java.util.Scanner;
public class Problem09 { // remainder and quotient
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = x % y;
        int q = x / y;
        System.out.println("Remainder = " + r);
        System.out.println("Quotient = " + q);

    }
}
