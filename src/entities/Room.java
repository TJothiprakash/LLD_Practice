package entities;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomId;
    private List<Appointment> appointments;
    private String description;

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", appointments=" + appointments +
                ", description='" + description + '\'' +
                '}';
    }

    public Room(int roomId, String description, List<Appointment> appointments) {
        this.roomId = roomId;
        this.description = description;
        this.appointments = new ArrayList<>();
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

}
