package model;

import java.util.*;

public class HallManager extends Staff {

    public static HashMap<String, String> MapStudentID;
    public List<Form> listForm;
    public HashMap<String, GuestModel> guestList;
    int hallNumber;


    public HallManager(String id, String firstName, String surName, String dateOfBirth, String gender, String email) {
        super(id, firstName, surName, dateOfBirth, gender, email);
    }

    public HashMap<String, GuestModel> getGuestList() {
        return guestList;
    }

    public void setGuestList(HashMap<String, GuestModel> guestList) {
        this.guestList = guestList;
    }

  

    public static HashMap<String, String> getListStudentID() {
        return MapStudentID;
    }

    public static void setListStudentID(HashMap<String, String> listStudentID) {
        HallManager.MapStudentID = listStudentID;
    }

    public List<Form> getListForm() {
        return listForm;
    }

    public void setListForm(List<Form> listForm) {
        this.listForm = listForm;
    }

    public static void addToBench(String id, String hall) {
        HallManager.MapStudentID.put(id, hall);
    }

    public static boolean removeStudent(String id) {
        HallManager.MapStudentID.remove(id);
        return true;
    }

}
