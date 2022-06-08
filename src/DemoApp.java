import model.Bug;

public class DemoApp {
    public static void main(String[] args) {

        Bug bug = new Bug("Opis błędu", "autor@gmail.pl", 6, "open");
        //System.out.println(bug.bugDescription);

//        bug.showAllInfo();
//
//        String addressEmail = bug.showAddressEmail();
//        System.out.println("Address email: " + addressEmail);
//
//        String bugStatus = bug.showBugStatus();
//        System.out.println("model.Bug status is: " + bugStatus);
//
//        int bugPriority = bug.showBugPriority();
//        System.out.println("model.Bug priority is: " + bugPriority);
//
//        String bugPriority1 = bug.bugPriority();
//        System.out.println("model.Bug priority from method is: " + bugPriority1);

        Bug newBug = new Bug("Opis błędu kodowania znaków", "adres@emial.pl", 4, "open");

        System.out.println(newBug.getBugDescription());

        newBug.setBugDescription("Nowy opis ma więcej niż 10 znaków");

        System.out.println(newBug.getBugDescription());

        System.out.println(newBug.getEmail());

        newBug.setEmail("backend@gmail.pl");

        System.out.println(newBug.getEmail());

        System.out.println(newBug.getPriority());

        newBug.setPriority(1);

        System.out.println(newBug.getPriority());
    }
}
