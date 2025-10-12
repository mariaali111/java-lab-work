package problem04;

public interface Scanner {
    void connect();

    default void details() {
        System.out.println("Scanner details: High-resolution!");
    }
}
