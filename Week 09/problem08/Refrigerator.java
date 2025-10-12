package problem08;

public class Refrigerator extends Appliance{

    public Refrigerator(String brand, int power) {
        super(brand, power);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " Refrigerator is now ON. Power: " + getPower() + "W");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " Refrigerator is now OFF.");
    }
}
