
package week8;

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the color of apple:");
        FRUIT4 apple = new FRUIT4(sc.next());
        
        System.out.println("Enter the color and taste of mango:");
        FRUIT4 mango = new FRUIT4(sc.next(), sc.next());
        
        System.out.println("Enter the color, taste and price per kg of kiwi:");
        FRUIT4 kiwi = new FRUIT4(sc.next(), sc.next(), sc.nextDouble());
        
        apple.display();
        mango.display();
        kiwi.display();
    }
}
