package Devices;

public class Thermostat implements Device {
    @Override
    public void operate() {
        System.out.println("Thermostat is set to comfortable mode.");
    }
}
