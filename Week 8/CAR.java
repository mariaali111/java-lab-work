package week8optional;

public class CAR {
    private String model;
    private String color;
    private double price;

    public void setDetails(double price) {
        this.price = price;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }

    public CAR() { // default constructor
        this("Unknown", "Not specified");
        this.price = 0.0;
    }
    public CAR(String model) { // one argument
        this.model = model;
    }
    public CAR(String model, String color) { // two arguments
        this(model);
        this.color = color;
    }
    public CAR(String model, String color, double price) {
        this(model, color);
        this.price = price;
    }
    void display() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Price (in lacs): " + price);
        System.out.println("----------------------------------");
    }
}
