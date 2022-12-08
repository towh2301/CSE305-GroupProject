package staff_model;

import staff_model.AssistantWardenMess;
import staff_model.AssistantWardenMaintenance;
import java.util.*;
import model.Form;
import model.Staff;

public class GeneralSecretary extends Staff {

    static List<Form> listFormMess;
    static List<Form> listFormMaintenance;

    public GeneralSecretary(String id, String firstName, String surName, String dateOfBirth, String gender, String email) {
        super(id, firstName, surName, dateOfBirth, gender, email);
    }

    public static void receiveFormMess(Form form) {
        GeneralSecretary.listFormMess.add(form);
    }

    public static void receiveFormMaintenance(Form form) {
        GeneralSecretary.listFormMaintenance.add(form);
    }

    public static boolean reviseFormMess(Form form) {
        GeneralSecretary.listFormMess.remove(form);
        return true;
    }

    public static boolean reviseFormMaintenance(Form form) {
        GeneralSecretary.listFormMaintenance.remove(form);
        return true;
    }

    public static void forwardFormMess(Form form) {
//        if (reviseFormMess(form)) {
        AssistantWardenMess.receive(form);
//        }
    }

    public static void forwardFormMaintenance(Form form) {
//        if (reviseFormMaintenance(form)) {
        AssistantWardenMaintenance.receive(form);
//        }
    }

}
