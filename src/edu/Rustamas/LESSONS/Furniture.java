package edu.Rustamas.LESSONS;

public class Furniture {

    private String name;
    private double length;
    private double width;
    private double heigth;

    public Furniture(String name, double length, double width, double heigth) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", heigth=" + heigth +
                '}';
    }
}
