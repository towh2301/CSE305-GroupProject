package staff_model;

import java.util.*;
import model.Form;

public class AssistantWardenMaintenance {
    static List<Form> listForm; 
    
    public static void receive(Form form){
        AssistantWardenMaintenance.listForm.add(form);
    }
    
    public static void addressTheProblem(Form form){
        AssistantWardenMaintenance.listForm.remove(form);
    }
}
