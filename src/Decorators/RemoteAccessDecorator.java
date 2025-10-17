package Decorators;

import Devices.Device;

public class RemoteAccessDecorator extends DeviceDecorator {
    public RemoteAccessDecorator(Device device) {
        super(device);
    }

    @Override
    public void operate() {
        decoratedDevice.operate();
        System.out.println("Remote access enabled via Internet.");
    }
}
