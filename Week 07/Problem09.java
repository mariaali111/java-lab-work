package optionalWeek7;

import java.util.Scanner;

public class Problem09 { // quick sort
    public static int partition(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low + 1, j = high;
        do {
            while (i <= high && a[i] <= pivot) {
                i++;
            }
            while (j >= low && a[j] > pivot) {
                j--;
            }
            if (i < j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        } while (i < j);
        int t = a[low];
        a[low] = a[j];
        a[j] = t;
        return j;
    }
    public static void quickSort(int[] a, int low, int high) {
        int partitionIndex; // index of pivot after partition
        if (low < high) {
            partitionIndex = partition(a, low, high);
            quickSort(a, low, partitionIndex - 1);
            quickSort(a, partitionIndex + 1, high);
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
        quickSort(a, 0, a.length - 1);
        for (int value : a) {
            System.out.print(value + " ");
        }
    }
}
