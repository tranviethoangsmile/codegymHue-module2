package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arrayValue;
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
        System.out.println("max: " + checkMax(newArray));


    }
    public static int checkMax(int [] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
}
