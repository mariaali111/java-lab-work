import java.util.Scanner;

public class Problem10_2 { // hexadecimal to decimal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hexadecimal number: ");
        String hex = sc.next();
        int d = 0;
        int base = 1; // 16 ^ 0

        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            if (ch >= '0' && ch <= '9') {
                d += (ch - '0') * base;
            }
            else if (ch >= 'A' && ch <= 'F') {
                d += (ch - 'A' + 10) * base;
            }
            else System.out.println("Invalid Hexadecimal Digit: " + ch);
            base *= 16;
        }
        System.out.println("Decimal number: " + d);
    }
}
