package com.codegymhueJava;

public class Main {

    public static void main(String[] args) {
	 Point2D point = new Point2D(5.4f, 5.5f);
        System.out.println(point.toString() + "\n");

     Point3D newPont3d = new Point3D(5.4f,7.8f,6.7f);
        System.out.println("Point3D: " + newPont3d.toString());
        for (double values : newPont3d.getXYZ()) {
            System.out.print(values + "\t");
        }
    }
}
