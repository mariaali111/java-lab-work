import java.util.Scanner;

public class Problem04 { // maximum and minimum in array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int value : arr) {
            if (value > max)
                max = value;
        }
        System.out.println("Maximum: " + max);

        int min = max;
        for (int value : arr) {
            if (value < min)
                min = value;
        }
        System.out.println("Minimum: " + min);
    }
}
