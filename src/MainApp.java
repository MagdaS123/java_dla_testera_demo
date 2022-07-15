import computer.Computer;
import computer.Laptop;
import computer.PC;

public class MainApp {
    public static void main(String[] args) {

        Computer officeComputer1 = new PC("Office computer 1", "HP", 500, 128);
        Computer officeComputer2 = new PC("Office computer 2", "HP", 500, 128);
        Computer officeComputer3 = new PC("Office computer 3", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HP Games", 500, 256, 50);
        Computer macbook = new Laptop("MB PRO", "PRO", 500, 256, 100);

        System.out.println(officeComputer1.volumeUp(100));
        System.out.println(officeComputer1.volumeUp(20));

        System.out.println(officeComputer1.volumeDown(100));
        System.out.println(officeComputer1.volumeDown(10));

        System.out.println(gamingLaptop.volumeUp(30));
        System.out.println(gamingLaptop.volumeUp(100));

        System.out.println(macbook.volumeDown(50));
        System.out.println(macbook.volumeDown(20));


//        System.out.println(officeComputer1.volumeUp());
//        System.out.println(officeComputer1.volumeUp());
//
//        System.out.println(officeComputer1.volumeDown());
//        System.out.println(officeComputer1.volumeDown());
//        System.out.println(officeComputer1.volumeDown());
//
//        System.out.println("--------------------------------------------------");
//
//        System.out.println(gamingLaptop.volumeUp());
//
//        System.out.println(gamingLaptop.volumeDown());
//        System.out.println(gamingLaptop.volumeDown());
//        System.out.println(gamingLaptop.volumeDown());
//        System.out.println(gamingLaptop.volumeDown());
//        System.out.println(gamingLaptop.volumeDown());
//        System.out.println(gamingLaptop.volumeDown());
    }
}
