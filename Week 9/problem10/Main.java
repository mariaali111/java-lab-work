package problem10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the school name:");
        Student.changeSchoolName(sc.nextLine());

        System.out.println("Enter the roll no, name and marks of the first student:");
        int r1 = sc.nextInt();
        sc.nextLine();
        String n1 = sc.nextLine();
        double m1 = sc.nextDouble();
        sc.nextLine();
        Student s1 = new Student(r1, n1, m1);

        System.out.println("Enter the roll no, name and marks of the second student:");
        int r2 = sc.nextInt();
        sc.nextLine();
        String n2 = sc.nextLine();
        double m2 = sc.nextDouble();
        sc.nextLine();
        Student s2 = new Student(r2, n2, m2);

        System.out.println("Before changing school name:");
        s1.display();
        s2.display();

        System.out.println("Enter the new school name:");
        Student.changeSchoolName(sc.nextLine());

        System.out.println("\nAfter changing school name:");
        s1.display();
        s2.display();
    }
}
