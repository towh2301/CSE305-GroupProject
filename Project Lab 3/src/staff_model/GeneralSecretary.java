package staff_model;

import staff_model.AssistantWardenMess;
import staff_model.AssistantWardenMaintenance;
import java.util.*;
import model.Form;
import model.Staff;

public class GeneralSecretary extends Staff {

    static List<Form> listForm;

    public GeneralSecretary(String id, String firstName, String surName, String dateOfBirth, String gender, String email) {
        super(id, firstName, surName, dateOfBirth, gender, email);
    }

    public static void receiveComplaintForm(Form form) {
        GeneralSecretary.listForm.add(form);
    }

    public static boolean reviseComplaintForm(Form form) {
        GeneralSecretary.listForm.remove(form);
        return true;
    }

    public static void forwardComplaintForm(Form form) {
        if (reviseComplaintForm(form)) {
            AssistantWardenMess.receive(form);
        }
    }
    
    public static void forwardMaintenanceForm(Form form) {
        if (reviseComplaintForm(form)) {
            AssistantWardenMaintenance.receive(form);
        }
    }

}
