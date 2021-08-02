package com.codegymhueJava;

public class Cylinder extends Circle {
    public double height;

    public Cylinder () {
        this.height = 10;
    }

    public Cylinder (double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return Math.PI * Math.pow(getRadius(),2) * getHeight();
    }

    public String toString() {
        return "Cylender have " + getRadius() + " and " + " Color is: " + getColor() + " have height "
                + getHeight() + " Volume = " + getVolume();
    }

}
