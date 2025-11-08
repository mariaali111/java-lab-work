import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    private int age;

    Person(int age) {
        this.age = age;
    }

    public void checkEligibility() throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible: Age under 18");
        }
        System.out.println("Person is eligible.");
    }
}
public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        Person p = new Person(sc.nextInt());

        try {
            p.checkEligibility();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
