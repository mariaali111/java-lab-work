package week8;

public class FRUIT3 {
    private String color;
    private String taste;
    private double price;
    FRUIT3(String color, String taste, double price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
    }
    void display() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
        System.out.println("-------------------");
    }
}
