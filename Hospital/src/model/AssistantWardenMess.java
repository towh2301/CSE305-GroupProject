package model;

import java.util.*;

public class AssistantWardenMess {
    static List<Form> listForm; 
    
    public static void receive(Form form){
        AssistantWardenMess.listForm.add(form);
    }
    
    public static void addressTheProblem(Form form){
        AssistantWardenMess.listForm.remove(form);
    }
}
