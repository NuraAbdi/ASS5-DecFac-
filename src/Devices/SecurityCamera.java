package Devices;

public class SecurityCamera implements Device {
    private boolean recording = false;

    @Override
    public void operate() {
        recording = !recording;
        if (recording) {
            System.out.println("Security camera started recording.");
        } else {
            System.out.println("Security camera stopped recording.");
        }
    }
}
