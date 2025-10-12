package problem03;

public interface Scooty {
    void offer();

    default void details() {
        System.out.println("Scooty details: Lightweight, fuel effiecient!");
    }
}
