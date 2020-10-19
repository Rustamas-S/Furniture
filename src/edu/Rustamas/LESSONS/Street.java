package edu.Rustamas.LESSONS;

import java.util.List;

public class Street {

    private String townName;
    private List<House> houseList;

    public Street(String townName, List<House> houseList) {
        this.townName = townName;
        this.houseList = houseList;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }

    @Override
    public String toString() {
        return "Street{" +
                "townName='" + townName + '\'' +
                ", houseList=" + houseList +
                '}';
    }
}
