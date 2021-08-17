package com.codegymhueJava;

public class IllegalTriangleException extends Exception{
    private double side1;
    private double side2;
    private double side3;

    public IllegalTriangleException(double side1, double side2, double side3) {
        super("Is not a triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}
