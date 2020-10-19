package edu.Rustamas.LESSONS;

import java.util.List;

public class House {

    private List<Room> roomList;

    public House(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomList=" + roomList +
                '}';
    }
}
