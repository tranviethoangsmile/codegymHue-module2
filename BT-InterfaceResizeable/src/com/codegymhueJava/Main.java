package com.codegymhueJava;

public class Main {

    public static void main(String[] args) {
//	test Shape
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);

//        test Circle
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);

//        test Rectangle

//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);


        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4.5,"green", true);
        shapes[1] = new Rectangle( 7.9, 5.6,"red", true);
        shapes[2] = new Square("pink", true, 10.2);

        System.out.println("Before: ");
        for (Shape elements : shapes){
            System.out.println(elements.toString());
        }

        System.out.println("After: ");
        for (Shape elements : shapes){
            double randomNumber = 0;
            elements.resize(randomNumber);
            System.out.println(elements.toString());
        }

    }

}
