package com.codegymhueJava;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int [][] matrix;
        int size;
        System.out.println("input size: ");
        size = sc.nextInt();
        matrix = new int[size][size];

	for(int i = 0; i < size; i++){
	    for(int j = 0; j < size; j++){
//            System.out.println("input number: ");
//            matrix[i][j] = sc.nextInt();
            matrix[i][j] = rd.nextInt(90);

        }
    }
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
//            System.out.println("input number: ");
//            matrix[i][j] = sc.nextInt();
//                System.out.println("ví trí " + "[" + i + "][" + j + "]=" + matrix[i][j] + " ");
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("max is: " + findMaxAtMatrix(matrix) );

    }
    public static int findMaxAtMatrix(int [][] array ){
        int max = array[0][0];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(max < array[i][j]){
                    max = array[i][j];
                }

            }
        }
        return max;
    }
}
