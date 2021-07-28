package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cel;
        double fah;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter fahrenheit: ");
                    cel = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + convertCtoF(cel));
                    break;
                }
                case 2:{
                    System.out.println("Enter Celsius: ");
                    fah = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + convertCtoF(fah));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }
    public static double convertCtoF(double cel){
        double fah = ( 9.0/5 ) * cel + 32;
        return fah;
    }
    public static double convertFtoC(double fah){
        double cel = ( 5.0 / 9 ) * ( fah - 32 );
        return cel;
    }
}
