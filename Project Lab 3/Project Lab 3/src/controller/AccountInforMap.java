package controller;

import java.util.HashMap;
import view.CreateAccount;

public class AccountInforMap {

    public static String getId(String userName) {
        CreateAccount create = new CreateAccount();
        return CreateAccount.mapStudentAccount.get(userName).getId();
    }
    
     public static String getName(String userName) {
        CreateAccount create = new CreateAccount();
        String fName = CreateAccount.mapStudentAccount.get(userName).getFirstName();
        String sName = CreateAccount.mapStudentAccount.get(userName).getSurName();
        return fName + " " + sName;
        
    }
}
