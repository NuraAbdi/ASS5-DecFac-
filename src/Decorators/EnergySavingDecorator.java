package Decorators;

import Devices.Device;

public class EnergySavingDecorator extends DeviceDecorator {
    private int energySaved = 0;

    public EnergySavingDecorator(Device device) {
        super(device);
    }

    @Override
    public void operate() {
        decoratedDevice.operate();
        energySaved += 10;
        System.out.println("Energy-saving mode active. Total energy saved: " + energySaved + " kWh.");
    }
}
