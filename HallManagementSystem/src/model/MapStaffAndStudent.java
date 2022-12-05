package model;

import java.util.HashMap;

public class MapStaffAndStudent {
    public static HashMap<String, Student> mapStudentAccount;
    public static HashMap<String, Staff> mapStaffAccount;

    public MapStaffAndStudent() {
        MapStaffAndStudent.mapStudentAccount = new HashMap<>();
        MapStaffAndStudent.mapStaffAccount = new HashMap<>();
    }
    
}
