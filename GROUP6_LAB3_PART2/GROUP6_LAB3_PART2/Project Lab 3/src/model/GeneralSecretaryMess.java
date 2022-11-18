package model;

import java.util.*;

public class GeneralSecretaryMess extends Staff {

    static List<Form> listForm;

    public GeneralSecretaryMess(String id, String firstName, String surName, String dateOfBirth, String gender, String email) {
        super(id, firstName, surName, dateOfBirth, gender, email);
    }

    public static void receiveComplaintForm(Form form) {
        GeneralSecretaryMess.listForm.add(form);
    }

    public static boolean reviseComplaintForm(Form form) {
        GeneralSecretaryMess.listForm.remove(form);
        return true;
    }

    public static void forwardComplaintForm(Form form) {
        if (reviseComplaintForm(form)) {
            AssistantWardenMess.receive(form);
        }
    }

}
