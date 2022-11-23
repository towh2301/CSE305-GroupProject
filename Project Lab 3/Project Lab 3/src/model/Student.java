package model;

public class Student extends People{
    String major;
    int seniority;

    public Student(String id, String firstName, String surName, String dateOfBirth, String gender, String email, String major, int seniority) {
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
        GeneralSecretary.receiveComplaintForm(form);
    }
    
    public void sendMaintenanceForm(Form form) {
        HallManager.receiveComplaintForm(form);
    }
}
