package Devices;

public class SecurityCamera implements Device {
    @Override
    public void operate() {
        System.out.println("Security camera is recording.");
    }
}
