package com.codegymhueJava;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return getRadius() * getRadius() * Math.PI;
    }

}
