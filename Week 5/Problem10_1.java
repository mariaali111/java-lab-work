import java.util.Scanner;

public class Problem10_1 { // decimal to hexadecimal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal number: ");
        int n = sc.nextInt();
        String hexa = "";

        while (n > 0) {
            int r = n % 16;
            n /= 16;
            if (r < 10) {
                hexa = r + hexa;
            }
            else {
               char c = (char) (65 + r % 10);
               hexa = c + hexa;
            }
        }
        System.out.println("Hexadecimal number: " + hexa);
    }
}
