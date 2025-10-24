package Devices;

public class MusicSystem implements Device {
    private boolean isPlaying = false;
    private int volume = 0;

    @Override
    public void operate() {
        if (!isPlaying) {
            isPlaying = true;
            volume = 50;
            System.out.println("Music started. Volume: " + volume + "%.");
        } else {
            isPlaying = false;
            System.out.println("Music stopped.");
        }
    }
}
