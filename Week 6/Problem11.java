import java.util.Scanner;

public class Problem11 { // frequency of characters
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c]++;
        }
        System.out.println("Character frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }
}
