package controller;

import java.util.ArrayList;
import java.util.List;
import model.AssistantWardenMaintenance;
import model.AssistantWardenMess;
import model.GeneralSecretary;
import model.Hall;
import model.HallManager;
import model.MapStaffAndStudent;

public class Administrator {
    private static final int numberOfHall = 6;
    
    private static List<Hall> listHall;
    private static List<GeneralSecretary> listGeneralSecretarys;
    private static List<HallManager> listHallManagers;
    private static List<AssistantWardenMaintenance> listMaintenanceAssistant;
    private static List<AssistantWardenMess> listMessAssistant;

    public Administrator() {
        listHall = new ArrayList<>();
        listMessAssistant = new ArrayList<>();
        listGeneralSecretarys = new ArrayList<>();
        listMaintenanceAssistant = new ArrayList<>();
        
        
        //add
        GeneralSecretary generalSecretary = new GeneralSecretary(1, "", "", "", "", "", "");
        AssistantWardenMess assistantWardenMess = new AssistantWardenMess(1, "", "", "", "", "", "");
        AssistantWardenMaintenance assistantWardenMaintenance = new AssistantWardenMaintenance(1, "", "", "", "", "", "");
                
        listGeneralSecretarys.add(generalSecretary);
        listMessAssistant.add(assistantWardenMess);
        listMaintenanceAssistant.add(assistantWardenMaintenance);
        
        //
        MapStaffAndStudent.mapStaffAccount.put("SEadmin1", generalSecretary);
        
        
        
    }

    public static List<GeneralSecretary> getListGeneralSecretarys() {
        return listGeneralSecretarys;
    }

    public static void setListGeneralSecretarys(List<GeneralSecretary> listGeneralSecretarys) {
        Administrator.listGeneralSecretarys = listGeneralSecretarys;
    }

    public static List<HallManager> getListHallManagers() {
        return listHallManagers;
    }

    public static void setListHallManagers(List<HallManager> listHallManagers) {
        Administrator.listHallManagers = listHallManagers;
    }

    public static List<AssistantWardenMaintenance> getListMaintenanceAssistant() {
        return listMaintenanceAssistant;
    }

    public static void setListMaintenanceAssistant(List<AssistantWardenMaintenance> listMaintenanceAssistant) {
        Administrator.listMaintenanceAssistant = listMaintenanceAssistant;
    }

    public static List<AssistantWardenMess> getListMessAssistant() {
        return listMessAssistant;
    }

    public static void setListMessAssistant(List<AssistantWardenMess> listMessAssistant) {
        Administrator.listMessAssistant = listMessAssistant;
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
