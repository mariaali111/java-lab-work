import java.util.Scanner;
public class Problem08 { // Celsius to Fahrenheit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        double c = sc.nextDouble();
        // F = (C x 9 / 5) + 32
        double f = (c * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit = " + f);
    }
}
