package problem05;

public class SmartPhone implements SmartDevice{

    @Override
    public void powerOn() {
        System.out.println("Smart Phone is powering on...");
    }

    @Override
    public void connectWiFi() {
        System.out.println("Smart Phone is connecting to WiFi...");
    }
}
