package controller;

import java.util.ArrayList;
import java.util.List;
import model.Hall;

public class Administrator {
    private static List<Hall> listHall;

    public static List<Hall> findSuitableHall(String major, String gender) {
        List<Hall> result = new ArrayList<>();
        for (Hall hall: listHall) {
            if (hall.getMajor().equals(major) && hall.getGender().equals(gender))
                result.add(hall);
        }
        return result;
    }
}
