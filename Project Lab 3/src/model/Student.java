package model;

import controller.Administrator;

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
        Administrator.getListGeneralSecretarys().get(this.getHallName()-1).receiveFormMess(form);
    }
    
    public void sendMaintenanceForm(Form form) {
        Administrator.getListGeneralSecretarys().get(this.getHallName()-1).receiveFormMaintenance(form);
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
    
<<<<<<< HEAD
    public int getHallName() {
        return Integer.parseInt(this.room.substring(1, this.room.indexOf(".")));
    }
    
=======
>>>>>>> 9624a6969165480328bf4b89ec10f7b2bd1bbd83
    
}
