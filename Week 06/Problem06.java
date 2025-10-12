import java.util.Scanner;

public class Problem06 { // linear search
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int item = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == item){
                System.out.println("Given value occurs at index " + i + " in the array.");
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Given value does not occur in the array.");
    }
}
