package problem04;

public interface Printer {
    void connect();

    default void details() {
        System.out.println("Printer details: High-quality!");
    }
}
