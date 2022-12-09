package controller;

import java.io.*;
import java.util.AbstractList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import model.Form;
import model.GuestModel;
import model.Hall;
import model.HallManager;
import model.MapStaffAndStudent;
import static model.MapStaffAndStudent.mapStudentAccount;
import model.Room;
import model.Staff;
import model.Student;
import staff_view.CreateStaffAccount;
import staff_view.CreateStudentAccount;
import staff_view.RoomStatus;

public class RestoreDataUtils {

    static FileReader frd = null;

    public static Hall RestoreHallEach(String fileName, String hallName) {
        Hall result = new Hall();
        result.setNumber(Integer.valueOf(fileName.charAt(fileName.lastIndexOf(".") - 1)));
        try {
            frd = new FileReader(fileName);
            BufferedReader brd = new BufferedReader(frd);
            result.setMajor(brd.readLine());
            result.setGender(brd.readLine());
            int numberOfRoom = Integer.parseInt(brd.readLine());
            result.setNumberOfRoom(numberOfRoom);
            for (int i = 1; i <= numberOfRoom; i++) {
                Room room = new Room(Integer.parseInt(brd.readLine()));

                //set room name
                room.setName(hallName + "." + i);

                //
                result.getListRoom().add(room);
            }
            frd.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException | IOException ex) {
            Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public static List<Hall> restoreHallAll() {
        List<Hall> result = new ArrayList<>();
        for (int i = 1; i <= Administrator.getNumberOfHall(); i++) {

            //add "H" + i to set hallName
            result.add(RestoreHallEach("hall" + i + ".txt", "H" + i));
            result.get(i - 1).setHallName("H" + i);
        }
        return result;
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
                MapStaffAndStudent.mapStaffAccount.put(id, staff);//add to hashMap
            }
            frd.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException | IOException ex) {
            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void RestoreDataFromFile(File studentFile, File staffFile) {
        restoreStudentData(studentFile);
        restoreStaffData(staffFile);
    }

    public static void restoreStudentData(File file) {
        //RoomInfor roomInfor = new RoomInfor();
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
                Student student = new Student(id, firstName, surName,
                        dob, gender, email, major, seniority);
                student.setRoom(room);
                MapStaffAndStudent.mapStudentAccount.put(id, student);//add to hashMap
            }
            frd.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException | IOException ex) {
            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void restoreHallInfor(File file) {
        FileReader frd;
        HallManager.MapStudentID = new HashMap<>();
        String id, hallName;
        
        try {
            frd = new FileReader(file);
            BufferedReader brd = new BufferedReader(frd);
            
            int studentNumber = Integer.parseInt(brd.readLine());
            
            for(; studentNumber > 0; studentNumber--){
                id = brd.readLine();
                hallName = brd.readLine();
                HallManager.MapStudentID.put(id, hallName);
            }

            frd.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException | IOException | NullPointerException ex) {
            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        //
        
    }

//    public static void restoreHallInfor(File file) {
//        FileReader frd;
//        HallManager.MapStudentID = new HashMap<>();
//       String id, hallName;
//
//      try {
//            frd = new FileReader(file);
//            BufferedReader brd = new BufferedReader(frd);
//
//            int studentNumber = Integer.parseInt(brd.readLine());
//
//            for (; studentNumber > 0; studentNumber--) {
//                id = brd.readLine();
//                hallName = brd.readLine();
//                HallManager.MapStudentID.put(id, hallName);
//            }
//
//            frd.close();
//        } catch (FileNotFoundException ex) {
//            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NumberFormatException | IOException | NullPointerException ex) {
//            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //

//    }

//    public static void restoreStaffData(File file) {
//        FileReader frd;
//        try {
//            frd = new FileReader(file);
//            BufferedReader brd = new BufferedReader(frd);
//            int staffNumber = Integer.parseInt(brd.readLine());
//
//            for (; staffNumber > 0; staffNumber--) {
//
//                //variables getter
//                String id = brd.readLine();
//                String firstName = brd.readLine();
//                String surName = brd.readLine();
//                String dob = brd.readLine();
//                String gender = brd.readLine();
//                String email = brd.readLine();
//
//                //add infor
//                CreateStaffAccount account = new CreateStaffAccount();
//                Staff staff = new Staff(id, firstName, surName,
//                        dob, gender, email);
//                MapStaffAndStudent.mapStaffAccount.put(id, staff);//add to hashMap
//            }
//            frd.close();
//        } catch (FileNotFoundException ex) {
//            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NumberFormatException | IOException ex) {
//            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    public static List<Form> restoreFormListData(File file) {
        FileReader frd;
        List<Form> result = new ArrayList<>();
        try {
            frd = new FileReader(file);
            BufferedReader brd = new BufferedReader(frd);
            int numForm = Integer.parseInt(brd.readLine());

            for (; numForm > 0; numForm--) {
                String id = brd.readLine();
                String summary = brd.readLine();
                String des = brd.readLine();

                //add to list form
                result.add(new Form(id, summary, des));
            }
            frd.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException | IOException ex) {
            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public static HashMap<String, GuestModel> restoreGuestInfor(File file) {
        FileReader frd;
        String id, beginDay;
        int duration;
        HashMap<String, GuestModel> result = new HashMap<>();
        try {
            frd = new FileReader(file);
            BufferedReader brd = new BufferedReader(frd);

            int studentNumber = Integer.parseInt(brd.readLine());

            for (; studentNumber > 0; studentNumber--) {
                id = brd.readLine();              
                beginDay = brd.readLine();
                duration = Integer.parseInt(brd.readLine());
                result.put(id, new GuestModel(beginDay, duration));
            }

            frd.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException | IOException | NullPointerException ex) {
            //Logger.getLogger(RestoreDataUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        //
        return result;
    }
}
