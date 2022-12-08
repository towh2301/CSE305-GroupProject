package model;

public class GuestModel {
    String beginDay;
    int duration;

    public GuestModel(String beginDay, int duration) {
        this.beginDay = beginDay;
        this.duration = duration;
    }

    public String getBeginDay() {
        return beginDay;
    }

    public void setBeginDay(String beginDay) {
        this.beginDay = beginDay;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
}
