package Decorators;

import Devices.Device;

public class VoiceControlDecorator extends DeviceDecorator {
    public VoiceControlDecorator(Device device) {
        super(device);
    }

    @Override
    public void operate() {
        decoratedDevice.operate();
        System.out.println("Voice control is enabled for this device.");
    }
}
