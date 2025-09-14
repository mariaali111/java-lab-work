package week7;

import java.util.Scanner;

public class Problem03 { // reverse a string
    public static void reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            rev += s.charAt(i);
        }
        System.out.println("Reversed string: " + rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Original string: ");
        String s = sc.nextLine();
        reverse(s);
    }
}
