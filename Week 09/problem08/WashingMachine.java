package problem08;

public class WashingMachine extends Appliance{

    WashingMachine(String brand, int power) {
        super(brand, power);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " Washing Machine is now ON. Power: " + getPower() + "W");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " Washing Machine is now OFF.");
    }
}
