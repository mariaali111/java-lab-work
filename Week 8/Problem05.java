package week8;

import java.util.Scanner;

public class Problem05 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the color, taste and price per kg of apple:");
        FRUIT5 apple = new FRUIT5(sc.next(), sc.next(), sc.nextDouble());
        
        System.out.println("Enter the color, taste and price per kg of mango:");
        FRUIT5 mango = new FRUIT5(sc.next(), sc.next(), sc.nextDouble());
        
        System.out.println("Enter the color, taste and price per kg of kiwi:");
        FRUIT5 kiwi = new FRUIT5(sc.next(), sc.next(), sc.nextDouble());
        
        apple.display();
        mango.display();
        kiwi.display();
    }
}
