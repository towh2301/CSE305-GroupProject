package controller;

import static model.MapStaffAndStudent.mapStudentAccount;
<<<<<<< HEAD
=======
import staff_view.CreateStudentAccount;
>>>>>>> 9624a6969165480328bf4b89ec10f7b2bd1bbd83

public class AccountInforMap {

    public static String getId(String userName) {
        //CreateAccount create = new CreateAccount();
        return mapStudentAccount.get(userName).getId();
    }

    public static String getName(String userName) {
        String fName = mapStudentAccount.get(userName).getFirstName();
        String sName = mapStudentAccount.get(userName).getSurName();
        return fName + " " + sName;
    }
    
    public static String getRoom(String userName) {
        return mapStudentAccount.get(userName).getRoom();
    }
}
