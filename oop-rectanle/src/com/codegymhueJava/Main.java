package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width;
        double height;
        System.out.println("input width: ");
        width = sc.nextDouble();
        System.out.println("input Height: ");
        height = sc.nextDouble();

        Rectanle rectanle = new Rectanle(width, height);
        System.out.println("ractangle: " + rectanle.displayRec());
        System.out.println("Perimeter: " + rectanle.getPerimeter());
        System.out.println("Area: " + rectanle.getArea());
    }
}

