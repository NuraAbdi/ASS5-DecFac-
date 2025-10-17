package Facade;

import Devices.Device;

public class HomeAutomationFacade {
    private Device light;
    private Device musicSystem;
    private Device thermostat;
    private Device securityCamera;

    public HomeAutomationFacade(Device light, Device musicSystem, Device thermostat, Device securityCamera) {
        this.light = light;
        this.musicSystem = musicSystem;
        this.thermostat = thermostat;
        this.securityCamera = securityCamera;
    }

    public void startPartyMode() {
        System.out.println("\n--- Party Mode Activated ---");
        light.operate();
        musicSystem.operate();
    }

    public void activateNightMode() {
        System.out.println("\n--- Night Mode Activated ---");
        System.out.println("Lights are turned off.");
        thermostat.operate();
        securityCamera.operate();
    }

    public void leaveHome() {
        System.out.println("\n--- Leaving Home ---");
        System.out.println("All lights and devices are turned off.");
        securityCamera.operate();
    }
}
