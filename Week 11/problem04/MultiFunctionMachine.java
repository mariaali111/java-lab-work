package problem04;

public class MultiFunctionMachine implements Printer, Scanner {

    @Override
    public void connect() {
        System.out.println("Connected successfully.");
    }

    @Override
    public void details() {
        System.out.println("Multi-Function Machine details:");
        Printer.super.details();
        Scanner.super.details();
    }
}
