package computer;

public class PC extends Computer {

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
    }

//    public void showComputerName() {
//        System.out.println(name);
//    }

    public int volumeUp() {
        return volumeLevel += 1;
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
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int volumeLevelOverload) {
        volumeLevelOverload -= 10;
        if (volumeLevelOverload <= 0) {
            return 0;
        } else {
            return volumeLevelOverload;
        }
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        super.switchOn();
    }

    @Override
    public void switchOff() {
        System.out.println("Wyłączam PC: " + name);
        state = false;
        //super.switchOff();
    }
}
