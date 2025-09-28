package week8;

public class FRUIT5 { // constructor chaining
    private String color;
    private String taste;
    private double price;
    FRUIT5(String color) {
        this.color = color;
    }
    FRUIT5(String color, String taste) {
        this(color);
        this.taste = taste;
    }
    FRUIT5(String color, String taste, double price) {
        this(color,taste);
        this.price = price;
    }
    void display() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
        System.out.println("-------------------");
    }
}
