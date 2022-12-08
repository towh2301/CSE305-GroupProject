package model;

import controller.Administrator;
import model.AssistantWardenMess;
import model.AssistantWardenMaintenance;
import java.util.*;
import model.Form;
import model.Staff;

public class GeneralSecretary extends Staff {

    private List<Form> listFormMess;
    private List<Form> listFormMaintenance;
    int hallNumber;

    public GeneralSecretary(int hallNumber, String id, String firstName, String surName, String dateOfBirth, String gender, String email) {
        super(id, firstName, surName, dateOfBirth, gender, email);
        this.hallNumber = hallNumber;
        this.listFormMess = new ArrayList<>();
        this.listFormMaintenance = new ArrayList<>();
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }
    
    

    public List<Form> getListFormMess() {
        return listFormMess;
    }

    public void setListFormMess(List<Form> listFormMess) {
        this.listFormMess = listFormMess;
    }

    public List<Form> getListFormMaintenance() {
        return listFormMaintenance;
    }

    public void setListFormMaintenance(List<Form> listFormMaintenance) {
        this.listFormMaintenance = listFormMaintenance;
    }
    

    public void receiveFormMess(Form form) {
        listFormMess.add(form);
    }

    public void receiveFormMaintenance(Form form) {
        listFormMaintenance.add(form);
    }

    public void reviseFormMess(Form form) {
        listFormMess.remove(form);
    }

    public void reviseFormMaintenance(Form form) {
        listFormMaintenance.remove(form);
    }

    public void forwardFormMess(Form form) {
        Administrator.getListMessAssistant().get(this.hallNumber-1).receive(form);
    }

    public void forwardFormMaintenance(Form form) {
        Administrator.getListMaintenanceAssistant().get(this.hallNumber-1).receive(form);
    }

}
