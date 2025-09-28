package problem08;

public abstract class Appliance {
    private String brand;
    private int power;

    public Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public String getBrand() { return brand; }
    public int getPower() { return power; }

    public abstract void turnOn();
    public abstract void turnOff();
}
