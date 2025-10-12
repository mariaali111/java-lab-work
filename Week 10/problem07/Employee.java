package problem07;

public class Employee {
    private String empName;
    private int empId;

    public Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }


    class Salary {
        private double basic;
        private double hra;
        private double pf;

        Salary(double basic, double hra, double pf) {
            this.basic = basic;
            this.hra = hra;
            this.pf = pf;
        }

        void displaySalary() {
            System.out.println("Salary Details:");
            System.out.println("Basic: " + basic);
            System.out.println("HRA: " + hra);
            System.out.println("PF: " + pf);
        }
    }

    class JoiningDate {
        private int day;
        private String month;
        private int year;

        JoiningDate(int day, String month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        void displayJoiningDate() {
            System.out.println("Joining Date: " + day + "/" + month + "/" + year);
        }
    }

    void displayEmployee(Salary salary, JoiningDate date) {
        System.out.println("Name: " + empName);
        System.out.println("ID: " + empId);
        salary.displaySalary();
        date.displayJoiningDate();
    }
}
