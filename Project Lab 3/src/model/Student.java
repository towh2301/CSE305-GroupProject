package model;

public class Student extends People{
    String major, room;
    int seniority;
    
    public Student(String id, String firstName, String surName, String dateOfBirth, String gender, String email, String major, int seniority, String room) {
        super(id, firstName, surName, dateOfBirth, gender, email);
        this.major = major;
        this.seniority = seniority;
        this.room = room;
    }
    
    public void setRoom(String room){
        this.room = room;
    }
    
    public String getRoom() {
        return room;
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
        GeneralSecretary.receiveFormMess(form);
    }
    
    public void sendMaintenanceForm(Form form) {
        GeneralSecretary.receiveFormMaintenance(form);
    }
}
