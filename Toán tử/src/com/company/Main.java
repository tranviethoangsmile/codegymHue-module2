package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	float width;
    	float height;
    	Scanner scanner = new Scanner(System.in);
		System.out.println("enter width: ");
		width = scanner.nextFloat();
		System.out.println("enter heigth: ");
		height = scanner.nextFloat();
		float area = height * width;
		System.out.println("area: " + area);

    }
}
