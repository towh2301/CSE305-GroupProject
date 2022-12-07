package controller;

import java.awt.Frame;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.HallManager;
import static model.MapStaffAndStudent.mapStaffAccount;
import static model.MapStaffAndStudent.mapStudentAccount;



public class ExitOptionBackup {

    public static void exitOption(JFrame frame) {
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(frame,
                        "Are you sure you want to close this window?", "Close Window?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    
                    //Backup student and staff
                    File studentFile = new File("student.txt");
                    File staffFile = new File("staff.txt");   
                    BackupDataUtils.backupFile(mapStudentAccount, studentFile, mapStaffAccount, staffFile);
                    
                    // backup Hall
                    File hallInfor = new File("HallForCreateRoom.txt");
                    if(!HallManager.MapStudentID.isEmpty()){
                        BackupDataUtils.backupHallForManager(hallInfor);
                    }
                    
                    System.exit(0);
                }
                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        });    
    }
}
