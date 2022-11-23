package model;

public class Form {
    String studentID, summary, description;    

    public Form(String studentID, String summary, String description) {
        this.studentID = studentID;
        this.summary = summary;
        this.description = description;
    }

    public Form(String studentID, String description) {
        this.studentID = studentID;
        this.description = description;
    }
    
    

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
