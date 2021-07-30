package com.codegymhueJava;

public class Main {

    public static void main(String[] args) {
	    Circle cir1 = new Circle();
	    cir1.setRadius(5);
        System.out.println("Area1: " + cir1.getArea());

        Circle cir2 = new Circle(10);
        System.out.println("Area2: " + cir2.getArea());
    }
}
