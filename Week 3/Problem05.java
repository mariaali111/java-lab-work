import java.util.Scanner;
public class Problem05 { // distance between two points
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first coordinates");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter second coordinates");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        // sqrt{(x2 - x1 ) ^ 2 + (y2 - y1) ^ 2}
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Distance = " +distance);
    }
}
