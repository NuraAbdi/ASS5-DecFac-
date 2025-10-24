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
        System.out.println("🎉 Party mode setup complete!");
    }

    public void activateNightMode() {
        System.out.println("\n--- Night Mode Activated ---");
        light.operate(); // выключает свет
        thermostat.operate();
        securityCamera.operate();
        System.out.println("🌙 House is now in night mode.");
    }

    public void leaveHome() {
        System.out.println("\n--- Leaving Home ---");
        musicSystem.operate(); // выключает музыку
        light.operate();       // выключает свет
        securityCamera.operate(); // включает запись
        System.out.println("🚪 All systems switched to away mode.");
    }
}
