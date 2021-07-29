package com.codegymhueJava;

public class Rectanle {
    double width, height;

    public Rectanle() {

    }

    public Rectanle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String displayRec() {
        return "Rectanle{" + "width : " + width + ", height: " + height +  "}";
    }
}
