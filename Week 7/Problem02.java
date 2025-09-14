package week7;

import java.util.Scanner;

public class Problem02 { // sorting - bubble sort
    public static void bubbleSort(int[] a) {
        int len = a.length;
        for (int pass = 0; pass < len; pass++) {
            boolean xchgs = false;
            for (int i = 0; i < len - 1 - pass; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    xchgs = true;
                }
            }
            if (!xchgs)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        bubbleSort(a);
        for (int value : a) {
            System.out.print(value + " ");
        }
    }
}
