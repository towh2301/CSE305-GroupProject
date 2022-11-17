package model;

public class Students extends People{
    String major;
    int seniority;

    public Students(String id, String firstName, String surName, String dateOfBirth, String gender, String email, String major, int seniority) {
        super(id, firstName, surName, dateOfBirth, gender, email);
        this.major = major;
        this.seniority = seniority;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
    
    public void sendMessForm(Form form) {
        GeneralSecretaryMess.receiveComplaintForm(form);
    }
    
    public void sendMaintenanceForm(Form form) {
        HallManager.receiveComplaintForm(form);
    }
}
