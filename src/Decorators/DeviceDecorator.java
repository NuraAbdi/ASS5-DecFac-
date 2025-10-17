package Decorators;

import Devices.Device;

public abstract class DeviceDecorator implements Device {
    protected Device decoratedDevice;

    public DeviceDecorator(Device device) {
        this.decoratedDevice = device;
    }

    @Override
    public void operate() {
        decoratedDevice.operate();
    }
}
