package model;

public class Student extends People{
    String major, room;
    int seniority, genderIdx, majorIdx;
    
    public Student(String id, String firstName, String surName, String dateOfBirth, String gender, String email, String major, int seniority) {
        super(id, firstName, surName, dateOfBirth, gender, email);
        this.major = major;
        this.seniority = seniority;
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

    public void setGenderIdx(int genderIdx) {
        this.genderIdx = genderIdx;
    }

    public void setMajorIdx(int majorIdx) {
        this.majorIdx = majorIdx;
    }

    public int getGenderIdx() {
        return genderIdx;
    }

    public int getMajorIdx() {
        return majorIdx;
    }
    
    
}
