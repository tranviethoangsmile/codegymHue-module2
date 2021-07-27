package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Tính năm nhuận");
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            } else {
                System.out.printf("%d is a leap year", year);
            }
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}