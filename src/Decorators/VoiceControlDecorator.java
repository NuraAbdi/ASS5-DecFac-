package Decorators;

import Devices.Device;

public class VoiceControlDecorator extends DeviceDecorator {
    private boolean voiceActive = false;

    public VoiceControlDecorator(Device device) {
        super(device);
    }

    @Override
    public void operate() {
        decoratedDevice.operate();
        voiceActive = true;
        System.out.println("Voice control activated for this device.");
    }
}
