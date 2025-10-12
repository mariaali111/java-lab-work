package week8;

public class FRUIT4 { // one argument and two argument constructors
    private String color;
    private String taste;
    private double price;
    FRUIT4(String c) { // one argument
        color = c;
    }
    FRUIT4(String c, String t) { // two arguments
        color = c;
        taste = t;
    }
    FRUIT4(String c, String t, double p) { // three arguments
        color = c;
        taste = t;
        price = p;
    }
    void display() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
        System.out.println("-------------------");
    }
}
