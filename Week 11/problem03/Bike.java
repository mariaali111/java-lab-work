package problem03;

public interface Bike {
    void offer();

    default void details() {
        System.out.println("Bike details: High performance, stylish design!");
    }
}
