package com.codegymhueJava;

import java.util.Scanner;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    private static Scanner sc = new Scanner(System.in);

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        checkTriangle();
    }

    public boolean isTriangle() {
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
            return true;
        } else {
            return false;
        }
    }

    private void checkTriangle() throws IllegalTriangleException {
        if (isTriangle() == false) {
            throw new IllegalTriangleException(side1, side2, side3);
        }
    }
}
