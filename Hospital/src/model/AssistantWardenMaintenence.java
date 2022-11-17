package model;

import java.util.*;

public class AssistantWardenMaintenence {
    static List<Form> listForm; 
    
    public static void receive(Form form){
        AssistantWardenMaintenence.listForm.add(form);
    }
    
    public static void addressTheProblem(Form form){
        AssistantWardenMaintenence.listForm.remove(form);
    }
}
