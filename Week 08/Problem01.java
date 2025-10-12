package week8;

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        FRUIT1 apple = new FRUIT1();
        System.out.println("Enter the color, taste and price per kg of apple:");
        apple.color = sc.next();
        apple.taste = sc.next();
        apple.price = sc.nextDouble();
       
        FRUIT1 mango = new FRUIT1();
        System.out.println("Enter the color, taste and price per kg of mango:");
        mango.color = sc.next();
        mango.taste = sc.next();
        mango.price =sc.nextDouble();
        
        FRUIT1 kiwi = new FRUIT1();
        System.out.println("Enter the color, taste and price per kg of kiwi:");   
        kiwi.color = sc.next();
        kiwi.taste = sc.next();
        kiwi.price = sc.nextDouble();
        
        apple.display();
        mango.display();
        kiwi.display();
    }
}
