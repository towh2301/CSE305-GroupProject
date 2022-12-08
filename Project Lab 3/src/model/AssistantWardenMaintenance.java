package model;

import java.util.*;

public class AssistantWardenMaintenance extends Staff{
    private List<Form> listForm; 
    
    int hallNumber;

    public AssistantWardenMaintenance(int hallNumber, String id, String firstName, String surName, String dateOfBirth, String gender, String email) {
        super(id, firstName, surName, dateOfBirth, gender, email);
        this.hallNumber = hallNumber;
    }

    public List<Form> getListForm() {
        return listForm;
    }

    public void setListForm(List<Form> listForm) {
        this.listForm = listForm;
    }
    
    public void receive(Form form){
        listForm.add(form);
    }
    
    public void addressTheProblem(Form form){
        listForm.remove(form);
    }
}
