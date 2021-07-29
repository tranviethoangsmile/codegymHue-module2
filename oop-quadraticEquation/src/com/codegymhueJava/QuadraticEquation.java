package com.codegymhueJava;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private double getA(){
        return this.a;
    }
    private double getB(){
        return this.b;
    }
    private double getC(){
        return this.c;
    }
    double getDiscriminant(){
        double delta;
        delta = (getB() * 2) - 4 * getA() * getC();
        return delta;
    }
    double getRoot1(){
        double root1;
        root1 = (- getB()) + Math.pow((getB() * getB()) - 4 * getA() * getC(), 0.5)/2*getA();
        return root1;
    }
    double getRoot2(){
        double root2;
        root2 = (- getB()) - Math.pow((getB() * getB()) - 4 * getA() * getC(), 0.5)/2*getA();
        return root2;
    }


}
