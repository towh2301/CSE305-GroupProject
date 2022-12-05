package model;

import model.AssistantWardenMaintenance;
import java.util.*;
import model.Form;
import model.Staff;

public class HallManager extends Staff {

    static List<Form> listForm;

    public HallManager(String id, String firstName, String surName, String dateOfBirth, String gender, String email) {
        super(id, firstName, surName, dateOfBirth, gender, email);
    }

    public static void receiveComplaintForm(Form form) {
        HallManager.listForm.add(form);
    }

    public static boolean reviseComplaintForm(Form form) {
        HallManager.listForm.remove(form);
        return true;
    }

    public static void forwardComplaintForm(Form form) {
        if (reviseComplaintForm(form)) {
            AssistantWardenMaintenance.receive(form);
        }
    }

}
