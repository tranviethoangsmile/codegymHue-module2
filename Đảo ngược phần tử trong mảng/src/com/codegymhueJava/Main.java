package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("input size: ");
        size = input.nextInt();
	    int [] arrayFist = new int[size];

        for(int i = 0; i < size; i++){
            int number;
            System.out.println("enter Number: ");
            number = input.nextInt();
            arrayFist[i] = number;
        }

        for(int i = 0 ; i < arrayFist.length; i++){
            System.out.print(arrayFist[i] + " ");
        }
        System.out.println(" ");

        for( int j = size - 1 ; j >= 0; j--){
            System.out.print(arrayFist[j] + " ");
        }

    }

}
