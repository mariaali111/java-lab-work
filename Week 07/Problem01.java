package week7;

import java.util.Scanner;

public class Problem01 { // binary search
    public static int binarySearch(int[] a, int start, int end, int key) {
        if (start > end)
            return -1;
        int mid = (start + end) / 2;
        if (a[mid] == key)
            return mid;
        if (a[mid] > key)
            return binarySearch(a , start, mid - 1, key);
        return binarySearch(a , mid + 1, end, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the numbers in ascending order:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int key = sc.nextInt();
        int loc = binarySearch(a, 0, n - 1, key);
        if (loc == -1)
            System.out.println("Not found!");
        else System.out.println("The number was found at index " + loc + ".");
    }
}
