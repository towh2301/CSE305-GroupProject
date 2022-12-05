package model;

import java.util.*;

public class Hall {
    private int number, numberOfRoom;
    private String major, gender;
    private List<Room> listRoom;
    private boolean isSelfCatering, isGuestRoomAvail;
    String hallName;
    
//    private static HashMap<String, Integer> singleRoom;
//    private static HashMap<String, Integer> twoRoom;
//    private static HashMap<String, Integer> fourRoom;

    public Hall() {
        this.listRoom = new ArrayList<>();
    }
    
    public Hall(byte number, byte numberOfRoom, String major, String gender, 
            boolean isSelfCatering, boolean isGuestRoomAvail) {
        this.number = number;
        this.numberOfRoom = numberOfRoom;
        this.major = major;
        this.gender = gender;
        this.isSelfCatering = isSelfCatering;
        this.isGuestRoomAvail = isGuestRoomAvail;
    }
    
    public void setHallName(String hallName){
        this.hallName = hallName;
    }
    
    public String getHallName(){
        return hallName;
    }

    public List<Room> getListRoom() {
        return listRoom;
    }
        
    public Hall(List<Room> listRoom) {
        this.listRoom = listRoom;
    }

    public String getMajor() {
        return major;
    }     

    public String getGender() {
        return gender;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public List<Room> findVacantRoom() {
        List<Room> result = new ArrayList<>();
        
        for (Room room : this.listRoom) {
            if (room.getCurrent() < room.getCapacity())
                result.add(room);
        }
        
        return result;
    }
       
//    public Hall() {
//        RoomInfor.singleRoom = new HashMap<>();
//        RoomInfor.twoRoom = new HashMap<>();
//        RoomInfor.fourRoom = new HashMap<>();
//        setGroup2Room();
//        setSingleRoom();
//        setGroup4Room();
//    }

//    public static HashMap<String, Integer> getTwoRoom() {
//        return twoRoom;
//    }
//
//    public static HashMap<String, Integer> getFourRoom() {
//        return fourRoom;
//    }
//
//    public static HashMap<String, Integer> getSingleRoom() {
//        return singleRoom;
//    }
//
//    public static void setSingleRoom() {
//        for (int i = 0; i < 10; i++) {
//            RoomInfor.singleRoom.put("A" + i, 0);
//        }
//    }
//
//    public static void setGroup2Room() {
//        for (int i = 0; i < 10; i++) {
//            RoomInfor.twoRoom.put("B" + i, 0);
//        }
//    }
//
//    public static void setGroup4Room() {
//        for (int i = 0; i < 10; i++) {
//            RoomInfor.fourRoom.put("C" + i, 0);
//        }
//    }

}
