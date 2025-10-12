package problem04_05;

public class Main {
    public static void main(String[] args) {

        JavaLanguage java = new JavaLanguage();
        System.out.println("---- Java Language object ----");
        java.abstraction();
        java.polymorphism();
        java.inheritance();

        java.persistence();
        java.interfaces();

        Cpp cpp = new Cpp();
        System.out.println("\n---- C++ object ----");
        cpp.abstraction();
        cpp.polymorphism();
        cpp.inheritance();

        cpp.template();
        cpp.friendFunction();
    }
}

