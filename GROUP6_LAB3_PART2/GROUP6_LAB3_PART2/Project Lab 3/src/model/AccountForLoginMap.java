package model;

import java.util.*;

public class AccountForLoginMap {

    public static HashMap<String, String> loginStudentMap = new HashMap<>();

    public static HashMap<String, String> loginStaffMap = new HashMap<>();

    public AccountForLoginMap() {
        loginStaffMap.put("admin", "admin");
        loginStudentMap.put("1", "1");
    }
//   static HashMap<String, Student> mapStaffAccount;
  

//    public static void putStaffAccount(String userName, Account account) {
//        mapStaffAccount.put(userName, account);
//    }

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
