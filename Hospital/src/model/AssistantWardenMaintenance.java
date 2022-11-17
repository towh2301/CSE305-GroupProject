package model;

import java.util.*;

public class AssistantWardenMaintenance {
    static List<Form> listForm; 
    
    public static void receive(Form form){
        AssistantWardenMaintenance.listForm.add(form);
    }
    
    public static void addressTheProblem(Form form){
        AssistantWardenMaintenance.listForm.remove(form);
    }
}
