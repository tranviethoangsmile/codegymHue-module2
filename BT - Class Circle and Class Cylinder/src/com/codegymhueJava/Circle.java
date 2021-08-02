package com.codegymhueJava;

public class Circle {
    public double radius;
    public String color;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public Circle(){
        this.radius = 1.5;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    public double getPerimeter() {
        return getRadius() * 2 * Math.PI;
    }

    public String toString() {
        return "Circle with Radius = " + getRadius() + " Color is: " + getColor()
                + " Area is : " + getArea() + " And "
                + " Perimeter is: " + getPerimeter();

    }
}
