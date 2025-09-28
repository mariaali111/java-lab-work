package problem07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name, salary and department:");
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        sc.nextLine();
        String dept = sc.nextLine();

        Manager m = new Manager(name, salary, dept);
        m.showDetails();
    }
}
