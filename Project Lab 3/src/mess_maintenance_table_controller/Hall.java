package mess_maintenance_table_controller;

import java.util.*;

public class RoomInfor {
    
    private static HashMap<String, Integer> singleRoom;
    private static HashMap<String, Integer> twoRoom;
    private static HashMap<String, Integer> fourRoom;

    public RoomInfor() {
        RoomInfor.singleRoom = new HashMap<>();
        RoomInfor.twoRoom = new HashMap<>();
        RoomInfor.fourRoom = new HashMap<>();
        setGroup2Room();
        setSingleRoom();
        setGroup4Room();
    }

    public static HashMap<String, Integer> getTwoRoom() {
        return twoRoom;
    }

    public static HashMap<String, Integer> getFourRoom() {
        return fourRoom;
    }

    public static HashMap<String, Integer> getSingleRoom() {
        return singleRoom;
    }

    public static void setSingleRoom() {
        for (int i = 0; i < 10; i++) {
            RoomInfor.singleRoom.put("A" + i, 0);
        }
    }

    public static void setGroup2Room() {
        for (int i = 0; i < 10; i++) {
            RoomInfor.twoRoom.put("B" + i, 0);
        }
    }

    public static void setGroup4Room() {
        for (int i = 0; i < 10; i++) {
            RoomInfor.fourRoom.put("C" + i, 0);
        }
    }

}
