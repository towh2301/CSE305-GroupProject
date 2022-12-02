package controller;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import model.MapStaffAndStudent;
import model.Staff;
import model.Student;
import staff_view.CreateStaffAccount;
import staff_view.CreateStudentAccount;

public class BackupDataUtils {

    public static void backupStudent(Student student, File file) {
        FileWriter fwr = null;
        try {
            fwr = new FileWriter(file, true);
            PrintWriter pwr = new PrintWriter(fwr);

            pwr.println(student.getId());
            pwr.println(student.getFirstName());
            pwr.println(student.getSurName());
            pwr.println(student.getDateOfBirth());
            pwr.println(student.getGender());
            pwr.println(student.getEmail());
            pwr.println(student.getMajor());
            pwr.println(student.getSeniority());
            pwr.println(student.getRoom());
            pwr.flush();
        } catch (IOException ex) {

        } finally {
            try {
                fwr.close();
            } catch (IOException ex) {

            }
        }
    }
    
    public static void backupStaff(Staff staff, File file) {
        FileWriter fwr = null;
        try {
            fwr = new FileWriter(file, true);
            PrintWriter pwr = new PrintWriter(fwr);

            pwr.println(staff.getId());
            pwr.println(staff.getFirstName());
            pwr.println(staff.getSurName());
            pwr.println(staff.getDateOfBirth());
            pwr.println(staff.getGender());
            pwr.println(staff.getEmail());
            pwr.flush();
        } catch (IOException ex) {

        } finally {
            try {
                fwr.close();
            } catch (IOException ex) {

            }
        }
    }

    public static void saveNumStudentAndStaff(int numberOfStudent, File studentFile, int numberOfStaff, File staffFile) {
        FileWriter studentFwr = null;
        FileWriter staffFwr = null;
        try {
            studentFwr = new FileWriter(studentFile, true);
            PrintWriter studentPwr = new PrintWriter(studentFwr);
            studentPwr.println(numberOfStudent);
            studentPwr.flush();
            
            staffFwr = new FileWriter(staffFile, true);
            PrintWriter staffPwr = new PrintWriter(staffFwr);
            staffPwr.println(numberOfStaff);
            staffPwr.flush();
            
        } catch (IOException ex) {

        } finally {
            try {
                studentFwr.close();
                staffFwr.close();
            } catch (IOException ex) {

            }
        }
    }
    
    public static void backupFile(HashMap<String, Student> mapStudentAccount, File studentFile,
                                  HashMap<String, Staff> mapStaffAccount, File staffFile){
        studentFile.delete();
        staffFile.delete();
        
        int numOfStudent = MapStaffAndStudent.mapStudentAccount.size();
        int numOfStaff = CreateStaffAccount.mapStaffAccount.size();
        
        saveNumStudentAndStaff(numOfStudent, studentFile, numOfStaff, staffFile);
        
        List<String> studentId = new ArrayList<>(mapStudentAccount.keySet());
        for(String id : studentId){
            backupStudent(mapStudentAccount.get(id), studentFile);
        }
        
        List<String> staffId = new ArrayList<>(mapStaffAccount.keySet());
        for(String id : staffId){
            backupStaff(mapStaffAccount.get(id), staffFile);
        }
    }
}
