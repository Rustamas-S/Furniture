package edu.Rustamas.LESSONS;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Furniture table = new Furniture("Coffee table", 2.50D, 1.50D, 0.50D);
        Furniture chair = new Furniture("Coffee chair", 1.50D, 0.50D, 0.50D);
        List<Furniture> furnitureList = new ArrayList<>();
        furnitureList.add(table);
        furnitureList.add(chair);

        Room hall = new Room("Hall", 18, furnitureList);
        Room kitchen = new Room("Kitchen", 9, furnitureList);
        Room bedroom = new Room("Bedroom", 15, furnitureList);
        Room bathroom = new Room("Bathroom", 5, furnitureList);
        Room WC = new Room("WC", 2, furnitureList);
        List<Room> roomsList = new ArrayList<>();
        roomsList.add(hall);
        roomsList.add(kitchen);
        roomsList.add(bedroom);
        roomsList.add(bathroom);
        roomsList.add(WC);

        House house1 = new House(roomsList);
        House house2 = new House(roomsList);
        House house3 = new House(roomsList);
        House house4 = new House(roomsList);
        List<House> housesList = new ArrayList<>();
        housesList.add(house1);
        housesList.add(house2);
        housesList.add(house3);
        housesList.add(house4);

        Street streetName = new Street("Tokyo", housesList);

        PrintFurnitureFromHouses(roomsList, housesList);

    }

    private static void PrintFurnitureFromHouses(List<Room> roomsList, List<House> housesList) {
        for (House house : housesList) {
            for (Room room : roomsList) {
                System.out.println(room.getFurnitureList());
            }
        }
    }
}
