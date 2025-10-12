import java.util.Scanner;
public class Problem04 { // Sum of N numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of the series 1 + 2 + 3 + ... + N");
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int sum = (n * (n + 1)) / 2;
        System.out.println("Sum of the series = " + sum);
    }
}
