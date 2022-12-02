package model;

public class Hall {
    int hallNumber;
    String description;
    
    public Hall(int hallNumber, String description) {
        this.hallNumber = hallNumber;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }
    
}
