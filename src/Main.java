import Devices.*;
import Decorators.*;
import Facade.*;

public class Main {
    public static void main(String[] args) {
        Device light = new Light();
        Device music = new MusicSystem();
        Device thermostat = new Thermostat();
        Device camera = new SecurityCamera();

        light = new VoiceControlDecorator(new EnergySavingDecorator(light));
        music = new RemoteAccessDecorator(new EnergySavingDecorator(music));

        HomeAutomationFacade home = new HomeAutomationFacade(light, music, thermostat, camera);

        home.startPartyMode();
        home.activateNightMode();
        home.leaveHome();
    }
}
