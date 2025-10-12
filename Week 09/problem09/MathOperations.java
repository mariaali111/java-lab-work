package problem09;

public class MathOperations {
    public static int findGCD(int a, int b) {
        if(a % b == 0) return b;
        return findGCD(b, a % b);
    }
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}
