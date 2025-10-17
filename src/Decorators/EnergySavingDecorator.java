package Decorators;

import Devices.Device;

public class EnergySavingDecorator extends DeviceDecorator {
    public EnergySavingDecorator(Device device) {
        super(device);
    }

    @Override
    public void operate() {
        decoratedDevice.operate();
        System.out.println("Energy-saving mode activated.");
    }
}
