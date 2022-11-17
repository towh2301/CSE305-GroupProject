package model;

import java.util.*;

public class AccountMap {

    public static HashMap<String, String> loginStudentMap = new HashMap<>();
    
    public static HashMap<String, String> loginStaffMap = new HashMap<>();

    public AccountMap() {
        loginStaffMap.put("admin", "admin");
    }

    public static void addAccount(String userName, String password) {
        loginStudentMap.put(userName, password);
    }

    public static HashMap<String, String> getAccountMap() {
        return loginStudentMap;
    }
}
