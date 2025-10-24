package Devices;

public class Thermostat implements Device {
    private int temperature = 22;

    @Override
    public void operate() {
        temperature += 1;
        System.out.println("Thermostat adjusted to " + temperature + "°C.");
    }
}
