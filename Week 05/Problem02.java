import java.util.Scanner;
public class Problem02 { // sum of all the elements of an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int sum = 0;

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Sum = " + sum);
    }
}
