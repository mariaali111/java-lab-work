package problem08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of a square: ");
        int a1 = Shape.area(sc.nextInt());
        System.out.println("Area of square = " + a1);

        System.out.print("Enter the length and breadth of a rectangle: ");
        int a2 = Shape.area(sc.nextInt(), sc.nextInt());
        System.out.println("Area of rectangle = " + a2);

        System.out.print("Enter the radius of a circle: ");
        double a3 = Shape.area(sc.nextDouble());
        System.out.println("Area of circle = " + a3);
    }
}
