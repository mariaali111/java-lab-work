package optionalWeek7;

import java.util.Scanner;

public class Problem08 { // anagrams
    public static boolean isAnagram(String s1, String s2) {
        // remove spaces and convert to lower case
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        if (s1.length() != s2.length())
            return false;
        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String s2 = sc.nextLine();
        if (isAnagram(s1, s2))
            System.out.println("The strings are anagram!");
        else System.out.println("Not anagrams!");
    }
}
