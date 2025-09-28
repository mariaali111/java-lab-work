package problem06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length and width of a rectangle:");
        Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.println("Area of Rectangle: " + r.area());

        System.out.println("Enter the radius of a circle:");
        Circle c = new Circle(sc.nextDouble());
        System.out.println("Area of Circle: " + c.area());
    }
}
