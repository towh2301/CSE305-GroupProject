package controller;

import java.awt.Frame;
import java.io.File;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
<<<<<<< HEAD
import model.Form;
=======
>>>>>>> 9624a6969165480328bf4b89ec10f7b2bd1bbd83
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
<<<<<<< HEAD
                                                       
=======
                    
>>>>>>> 9624a6969165480328bf4b89ec10f7b2bd1bbd83
                    System.exit(0);
                }
                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        });    
    }
    
    public static void exitOptionList(JFrame frame, int hallNumber, List<Form> listForm) {
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(frame,
                        "Are you sure you want to close this window?", "Close Window?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    
                    //Backup form
                    File file = new File("mess" + hallNumber);
                    BackupDataUtils.backupListForm(listForm, file);

                }
                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        });    
    }
    
    public static void exitOptionListWardenMess(JFrame frame, int hallNumber, List<Form> listForm) {
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(frame,
                        "Are you sure you want to close this window?", "Close Window?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    
                    //Backup form
                    File file = new File("wardene" + hallNumber);
                    BackupDataUtils.backupListForm(listForm, file);

                }
                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        });    
    }
}
