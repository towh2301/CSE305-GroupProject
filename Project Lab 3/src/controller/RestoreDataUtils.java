package controller;

import mess_maintenance_table_controller.RoomInfor;
import java.io.*;
import model.MapStaffAndStudent;
import static model.MapStaffAndStudent.mapStudentAccount;
import model.Staff;
import model.Student;
import staff_view.CreateStaffAccount;
import staff_view.CreateStudentAccount;
import staff_view.RoomStatus;

public class RestoreDataUtils {

    public static void RestoreDataFromFile(File studentFile, File staffFile) {
        restoreStudentData(studentFile);
        restoreStaffData(staffFile);
    }

    public static void restoreStudentData(File file) {
        RoomInfor roomInfor = new RoomInfor();
        FileReader frd;
        try {
            frd = new FileReader(file);
            BufferedReader brd = new BufferedReader(frd);
            int studentNumber = Integer.parseInt(brd.readLine());

            for (; studentNumber > 0; studentNumber--) {

                //variables getter
                String id = brd.readLine();
                String firstName = brd.readLine();
                String surName = brd.readLine();
                String dob = brd.readLine();
                String gender = brd.readLine();
                String email = brd.readLine();
                String major = brd.readLine();
                int seniority = Integer.parseInt(brd.readLine());
                String room = brd.readLine();

                //add infor
                String a = String.valueOf(room.charAt(0));

                switch (a) {
                    case "A" -> {
                        RoomInfor.getSingleRoom().replace(room, 1);
                    }
                    case "B" -> {
                        int tempStudent = RoomInfor.getTwoRoom().get(room) + 1;
                        RoomInfor.getTwoRoom().replace(room, tempStudent);
                    }
                    case "C" -> {
                        int tempStudent = RoomInfor.getFourRoom().get(room) + 1;
                        RoomInfor.getFourRoom().replace(room, tempStudent);
                    }
                }

                Student student = new Student(id, firstName, surName,
                        dob, gender, email, major, seniority, room);
                MapStaffAndStudent.mapStudentAccount.put(id, student);//add to hashMap
            }
            frd.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException | IOException ex) {
            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void restoreStaffData(File file) {
        FileReader frd;
        try {
            frd = new FileReader(file);
            BufferedReader brd = new BufferedReader(frd);
            int staffNumber = Integer.parseInt(brd.readLine());

            for (; staffNumber > 0; staffNumber--) {

                //variables getter
                String id = brd.readLine();
                String firstName = brd.readLine();
                String surName = brd.readLine();
                String dob = brd.readLine();
                String gender = brd.readLine();
                String email = brd.readLine();

                //add infor
                CreateStaffAccount account = new CreateStaffAccount();
                Staff staff = new Staff(id, firstName, surName,
                        dob, gender, email);
                CreateStaffAccount.mapStaffAccount.put(id, staff);//add to hashMap
            }
            frd.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException | IOException ex) {
            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
