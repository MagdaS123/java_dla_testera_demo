package computer;

public class PC extends Computer {

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
    }

    public void showComputerName() {
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking computer is turned on/turned off");
        if (computerState == 1) {
            super.switchOn();
        } else {
            System.out.println("Computer is turned off");
        }

    }

    public void setPowerState(int newComputerState) {
        computerState = newComputerState;

    }
}
