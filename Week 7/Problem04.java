package week7;

import java.util.Scanner;

public class Problem04 { // string palindrome
    public static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        String rev = reverse(s);
        if (s.compareToIgnoreCase(rev) == 0)
            System.out.println("Given string is a palindrome.");
        else System.out.println("Given string is not a palindrome.");
    }
}
