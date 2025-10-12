package problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three integers:");
        Polymorphism.minMaxAdd(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println("Enter three real numbers:");
        Polymorphism.minMaxAdd(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter three characters:");
        Polymorphism.minMaxAdd(sc.next().charAt(0), sc.next().charAt(0), sc.next().charAt(0));
    }


}
