package problem10;

public class Student {
    private int rollNo;
    private String name;
    private double marks;
    private static String schoolName;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public static void changeSchoolName(String newName) {
        schoolName = newName;
    }

    public void display() {
        System.out.println("Student details ----------->");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("School: " + schoolName);
    }
}
