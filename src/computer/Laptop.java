package computer;

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeUp(int volumeLevelOverload) {
        volumeLevelOverload += 10;
        if (volumeLevelOverload >= 0 && volumeLevelOverload <= 100) {
            return volumeLevelOverload;
        } else {
            return 100;
        }
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 2;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int volumeLevelOverload) {
        volumeLevelOverload -= 20;
        if (volumeLevelOverload <= 0) {
            return 0;
        } else {
            return volumeLevelOverload;
        }
    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level to low!");
        }

    }

    @Override
    public void switchOff() {
        System.out.println("Wyłączam taptop: " + name);
        state = false;
        //super.switchOff();
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }
}
