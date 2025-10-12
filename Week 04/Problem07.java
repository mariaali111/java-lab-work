import java.util.Scanner;
public class Problem07 { // smallest among four
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a < b) {
            if (a < c) {
                if (a < d)
                    System.out.println(a + " is the smallest.");
                else System.out.println(d + " is the smallest.");
            }
            else {
                if (c < d)
                    System.out.println(c + " is the smallest.");
                else System.out.println(d + " is the smallest.");
            }
        }
        else {
            if (b < c) {
                if (b < d)
                    System.out.println(b + " is the smallest.");
                else System.out.println(d + " is the smallest.");
            }
            else {
                if (c < d)
                    System.out.println(c + " is the smallest.");
                else System.out.println(d + " is the smallest.");
            }
        }
    }
}
