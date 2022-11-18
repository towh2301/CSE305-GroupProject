package model;

import java.util.HashMap;
import view.CreateAccount;

public class AccountInforMap {
    
    public static String getInfor(String userName) {
        CreateAccount create = new CreateAccount();
        String string;
        String firstName = CreateAccount.mapStudentAccount.get(userName).getFirstName();
        String surName = CreateAccount.mapStudentAccount.get(userName).getSurName();
        String id = CreateAccount.mapStudentAccount.get(userName).getId();
        StringBuilder sBuilder = new StringBuilder();
        
        sBuilder.append("Name: ").append(firstName).append(" ").append(surName).append("\n");
        sBuilder.append("ID: ").append(id);
        
        return sBuilder.toString();
        
    }

}
