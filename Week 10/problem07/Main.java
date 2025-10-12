package problem07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name and ID of the employee:");
        String name = sc.nextLine();
        int ID = sc.nextInt();
        Employee emp = new Employee(name, ID);

        System.out.println("Enter the Salary: (Basic, HRA & PF)");
        Employee.Salary salary = new Employee(name, ID).new Salary(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter the joining date: (date month year)");
        Employee.JoiningDate date = new Employee(name, ID).new JoiningDate(sc.nextInt(), sc.next(), sc.nextInt());

        emp.displayEmployee(salary, date);
    }
}
