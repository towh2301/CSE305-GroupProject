package model;

import java.util.*;

public class AccountMap {

    public static HashMap<String, String> loginStudentMap = new HashMap<>();
    
    public static HashMap<String, String> loginStaffMap = new HashMap<>();

    public AccountMap() {
        loginStaffMap.put("admin", "admin");
        loginStudentMap.put("1", "1");
    }

    public static void addAccount(String userName, String password) {
        loginStudentMap.put(userName, password);
    }

    public static HashMap<String, String> getStaffAccountMap() {
        return loginStaffMap;
    }
    public static HashMap<String, String> getStudentAccountMap() {
        return loginStudentMap;
    }
}
