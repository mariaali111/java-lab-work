import java.util.Scanner;
public class Problem07 { // area of rectangle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of a rectangle:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double area = l * b;
        System.out.println("Area of rectangle = " + area);
    }
}
