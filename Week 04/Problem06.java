import java.util.Scanner;
public class Problem06 { // vowel or consonant
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet:");
        char ch = sc.next().charAt(0);

        switch (Character.toLowerCase(ch)) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is a consonant.");
        }
    }
}
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
//        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//            System.out.println(ch + " is a vowel.");
//        }
//        else
//            System.out.println(ch + " is a consonant.");