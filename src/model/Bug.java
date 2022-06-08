package model;

public class Bug {

    private String bugDescription; //description
    private String email;
    private int priority;
    private String status;

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() > 10 ){
            this.bugDescription = bugDescription;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")){
            this.email = email;
        }
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (priority == 1 || priority == 2 || priority == 3 || priority == 4 || priority == 5 ){
            this.priority = priority;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Bug(String bugDescription, String email, int priority, String status) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.priority = priority;
        this.status = status;
    }

    public void showAllInfo() {
        System.out.println(bugDescription + " " + email + " " + priority + " " + status);
    }

    public String showAddressEmail() {
        return email;
    }

    public String showBugStatus() {
        return "open";
    }

    public int showBugPriority() {
        return priority;
    }

    public String bugPriority() {
        if (priority == 1) {
            return "Lowest";
        } else if (priority == 2) {
            return "Low";
        } else if (priority == 3) {
            return "Medium";
        } else if (priority == 4) {
            return "High";
        } else if (priority == 5) {
            return "Highest";
        }
        return "bug priority doesn't exist";
    }
}
