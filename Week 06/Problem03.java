import java.util.Scanner;

public class Problem03 { // swap first and last element of array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        arr[0] = arr[n - 1];
        arr[n - 1] = temp;

        System.out.println("Array after swaping:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
