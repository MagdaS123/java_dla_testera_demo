import computer.Laptop;
import computer.PC;

public class MainApp {
    public static void main(String[] args) {

        PC officeComputer = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP Games", 500, 256, 50);

        gamingLaptop.setBatteryLevel(0);

        gamingLaptop.switchOn();
        System.out.println(gamingLaptop.getState());

        // officeComputer.showComputerName();

        officeComputer.setPowerState(1);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

    }
}
