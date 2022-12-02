package application;

import controller.RestoreDataUtils;
import java.io.File;
import model.MapStaffAndStudent;
import view.LoginForm;
import staff_view.SecretaryHomePage;

public class Hospital {
    
    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        
        //initialize staff
        new SecretaryHomePage();
        new MapStaffAndStudent();
        
        //restore
        File studentFile = new File("student.txt");
        File staffFile = new File("staff.txt");
        
        RestoreDataUtils.RestoreDataFromFile(studentFile, staffFile);
    }
    
}
