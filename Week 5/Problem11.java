public class Problem11 { // printing a pattern
    public static void main(String[] args) {
        int n = 3;
        int stars;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                stars = i;
            }
            else stars = 2 * n - i;
            int spaces = n - stars;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
