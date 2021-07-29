package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("input a: ");
        a = sc.nextDouble();
        System.out.println("input b: ");
        b = sc.nextDouble();
        System.out.println("input c: ");
        c = sc.nextDouble();

	QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
	if(quadraticEquation.getDiscriminant() >= 0){
        System.out.println("root1: " + quadraticEquation.getRoot1());
        System.out.println("root2: " + quadraticEquation.getRoot2());
    }else if(quadraticEquation.getDiscriminant() == 0){
        System.out.println("root1: " + quadraticEquation.getRoot1());
    }else{
        System.out.println("The equation has no roots");
    }



    }
}
