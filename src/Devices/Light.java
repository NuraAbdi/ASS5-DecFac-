package Devices;

public class Light implements Device {
    @Override
    public void operate() {
        System.out.println("Light is turned on.");
    }
}
