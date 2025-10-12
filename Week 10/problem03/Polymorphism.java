package problem03;

public class Polymorphism {
    // For integers
    static void minMaxAdd(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c;

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Sum = " + sum);
        System.out.println();
    }

    // For real numbers
    static void minMaxAdd(double a, double b, double c) {
        double min = Math.min(a, Math.min(b, c));
        double max = Math.max(a, Math.max(b, c));
        double sum = a + b + c;

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Sum = " + sum);
        System.out.println();
    }

    // For characters
    static void minMaxAdd(char a, char b, char c) {
        char min = (char) Math.min(a, Math.min(b, c));
        char max = (char) Math.max(a, Math.max(b, c));
        int sum = a + b + c;

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Sum = " + sum);
        System.out.println();
    }
}
