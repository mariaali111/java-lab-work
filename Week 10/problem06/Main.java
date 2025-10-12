package problem06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter University name, Ranking, Faculty, Department, Chairman:");
        String uniName = sc.nextLine();
        int ranking = sc.nextInt();
        sc.nextLine();
        String facultyName = sc.nextLine();
        String deptName = sc.nextLine();
        String chairman = sc.nextLine();

        Department dept = new Department(uniName, ranking, facultyName, deptName, chairman);
        dept.Display();
    }
}
