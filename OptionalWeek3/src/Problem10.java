import java.util.Scanner;
public class Problem10 { // circumference
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        double r = sc.nextDouble();
        double c = 2 * Math.PI * r;
        System.out.println("Circumference of the circle = " + c);
    }
}
