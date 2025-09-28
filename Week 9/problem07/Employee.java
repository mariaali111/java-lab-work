package problem07;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showDetails() {
        System.out.println("Details: ------------->");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
