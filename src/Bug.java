public class Bug {

    String bugDescritpion;
    String email;
    int priority;
    String status;

    Bug(String bugDescritpion, String email, int priority, String status) {
        this.bugDescritpion = bugDescritpion;
        this.email = email;
        this.priority = priority;
        this.status = status;
    }

    void showAllInfo() {
        System.out.println(bugDescritpion + " " + email + " " + priority + " " + status);
    }

    String showAddressEmail() {
        return email;
    }

    String showBugStatus() {
        return "open";
    }

    int showBugPriority() {
        return priority;
    }

    String bugPriority() {
        int bug = priority;
        String priorityStatus;
        if (bug == 1) {
            return priorityStatus = "Lowest";
        } else if (bug == 2) {
            return priorityStatus = "Low";
        } else if (bug == 3) {
            return
                    priorityStatus = "Medium";
        } else if (bug == 4) {
            return priorityStatus = "High";
        } else if (bug == 5) {
            return priorityStatus = "Highest";
        }
        return "bug priority doesn't exist";
    }


}
