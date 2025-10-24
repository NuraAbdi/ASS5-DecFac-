package Devices;

public class Light implements Device {
    private boolean isOn = false;
    private int brightness = 0;

    @Override
    public void operate() {
        if (!isOn) {
            isOn = true;
            brightness = 75;
            System.out.println("Light turned ON. Brightness set to " + brightness + "%.");
        } else {
            isOn = false;
            System.out.println("Light turned OFF.");
        }
    }
}
