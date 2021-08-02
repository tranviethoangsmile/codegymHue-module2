package com.codegymhueJava;

public class Main {

    public static void main(String[] args) {
//	Test move
        MoveablePoint movablePoint = new MoveablePoint(3.3f, 2.2f, 5.5f, 4.4f);
        System.out.println("Điểm di chuyển trước: "+movablePoint.toString());
        movablePoint.move();
        System.out.println("Điểm di chuyển sau: "+movablePoint.toString());
//    test point
        Point point = new Point(4.4f, 6.6f);
        System.out.println("point: " + point.toString());
        for (double values : point.getXY()) {
            System.out.print(values + "\t");
        }

    }
}
