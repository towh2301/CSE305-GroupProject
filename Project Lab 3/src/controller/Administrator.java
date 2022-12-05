package controller;

import java.util.ArrayList;
import java.util.List;
import model.Hall;

public class Administrator {
    private static final int numberOfHall = 6;
    private static List<Hall> listHall;

    public Administrator() {
        listHall = new ArrayList<>();
    }

    public static int getNumberOfHall() {
        return numberOfHall;
    }

    public static List<Hall> getListHall() {
        return listHall;
    }

    public static void setListHall(List<Hall> listHall) {
        Administrator.listHall = listHall;
    }
    
    
   
    public static List<Hall> findSuitableHall(String major, String gender) {
        List<Hall> result = new ArrayList<>();
        for (Hall hall: listHall) {
            if (hall.getMajor().equals(major) && hall.getGender().equals(gender))
                result.add(hall);
        }
        return result;
    }
}
