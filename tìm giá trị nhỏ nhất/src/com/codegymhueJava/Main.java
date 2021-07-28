package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("input size: ");
        size = sc.nextInt();
        int [] newArray;
        newArray = new int[size];
        for(int i= 0; i < size; i++){
            System.out.println("input value: " + (i) + ":");
            newArray[i] = sc.nextInt();
        }
        System.out.println("max: " + checkMin(newArray));


    }
    public static int checkMin(int [] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
