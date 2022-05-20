public class DemoApp {
    public static void main(String[] args) {

        Bug bug = new Bug("Opis błędu", "autor@gmail.pl", 6, "open");
        System.out.println(bug.bugDescritpion);

        bug.showAllInfo();

        String addressEmail = bug.showAddressEmail();
        System.out.println("Address email: " + addressEmail);

        String bugStatus = bug.showBugStatus();
        System.out.println("Bug status is: " + bugStatus);

        int bugPriority = bug.showBugPriority();
        System.out.println("Bug priority is: " + bugPriority);

        String bugPriority1 = bug.bugPriority();
        System.out.println("Bug priority from method is: " + bugPriority1);
    }
}
