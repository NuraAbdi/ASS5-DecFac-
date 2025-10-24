package Decorators;

import Devices.Device;

public class RemoteAccessDecorator extends DeviceDecorator {
    private boolean remoteEnabled = false;

    public RemoteAccessDecorator(Device device) {
        super(device);
    }

    @Override
    public void operate() {
        decoratedDevice.operate();
        remoteEnabled = true;
        System.out.println("Device can now be controlled remotely.");
    }
}
