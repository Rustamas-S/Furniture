package edu.Rustamas.LESSONS;

import java.util.List;

public class Room {

    private String name;
    private double size;
    private List<Furniture> furnitureList;

    public Room(String name, double size, List<Furniture> furnitureList) {
        this.name = name;
        this.size = size;
        this.furnitureList = furnitureList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public List<Furniture> getFurnitureList() {
        return furnitureList;
    }

    public void setFurnitureList(List<Furniture> furnitureList) {
        this.furnitureList = furnitureList;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", furnitureList=" + furnitureList +
                '}';
    }
}
