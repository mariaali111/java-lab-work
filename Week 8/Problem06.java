package week8optional;

import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CAR car1 = new CAR();
        System.out.println("Enter the price in lacs of the first car:");
        car1.setDetails(sc.nextDouble());

        sc.nextLine(); //clear buffer

        System.out.println("Enter the model and price in lacs of the second car:");
        CAR car2 = new CAR(sc.nextLine());
        car2.setDetails(sc.nextDouble());

        sc.nextLine(); //clear buffer
        
        System.out.println("Enter the model, color and price in lacs of the third car:");
        CAR car3 = new CAR(sc.nextLine(), sc.nextLine());
        car3.setDetails(sc.nextDouble());

        sc.nextLine(); //clear buffer

        car1.display();
        car2.display();
        car3.display();
    }
}
