package problem03;

public class BuySomething implements Bike, Scooty {
    @Override
    public void offer() {
        System.out.println("Special offers available on bikes and scooties!");
    }

    @Override
    public void details() {
        System.out.println("details:");
        Bike.super.details();
        Scooty.super.details();
    }
}
