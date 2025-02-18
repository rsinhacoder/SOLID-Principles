// Violation of DIP
class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb: ON");
    }

    public void turnOff() {
        System.out.println("LightBulb: OFF");
    }
}

class Switch {
    private LightBulb bulb;

    public Switch(LightBulb bulb) {
        this.bulb = bulb;
    }

    public void operate() {
        bulb.turnOn();
    }
}

// Adhering to DIP
interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: ON");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb: OFF");
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: OFF");
    }
}

class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}