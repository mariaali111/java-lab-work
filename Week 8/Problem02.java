package week8;

import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        FRUIT2 apple = new FRUIT2();
        System.out.println("Enter the color, taste and price per kg of apple:");
        apple.setDetails(sc.next(), sc.next(), sc.nextDouble());
        
        FRUIT2 mango = new FRUIT2();
        System.out.println("Enter the color, taste and price per kg of mango:");
        mango.setDetails(sc.next(), sc.next(), sc.nextDouble());
        
        FRUIT2 kiwi = new FRUIT2();
        System.out.println("Enter the color, taste and price per kg of kiwi:");
        kiwi.setDetails(sc.next(), sc.next(), sc.nextDouble());
        
        apple.display();
        mango.display();
        kiwi.display();
    }
}
