package week8;

import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the color, taste and price per kg of apple:");
        FRUIT3 apple = new FRUIT3(sc.next(), sc.next(), sc.nextDouble());
        
        System.out.println("Enter the color, taste and price per kg of mango:");
        FRUIT3 mango = new FRUIT3(sc.next(), sc.next(), sc.nextDouble());
        
        System.out.println("Enter the color, taste and price per kg of kiwi:");
        FRUIT3 kiwi = new FRUIT3(sc.next(), sc.next(), sc.nextDouble());
        
        apple.display();
        mango.display();
        kiwi.display();
    }
}
