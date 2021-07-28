package com.codegymhueJava;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//	nối mảng bằng cách thủ công.
//        int [] arrayFist = {1,2,3,4,5};
//        int [] arrayLast = {6,7,8,9,0};
//        int [] newArray;
//        int newArrLength = arrayFist.length + arrayLast.length;
//        newArray = new int[newArrLength];
//        int push = 0;
//
//        System.out.println("Mảng 1: ");
//        for(int element: arrayFist){
//            System.out.println(element + " ");
//            newArray[push] = element;
//            push++;
//        }
//
//        System.out.println("mảng 2: ");
//        for(int element: arrayLast){
//            System.out.println(element + " ");
//            newArray[push] = element;
//            push++;
//        }
//
//        System.out.println("Mảng sau khi gộp: ");
//        for(int element: newArray){
//            System.out.print(element + " ");
//        }


//        sử dụng arraycoppy();
        int [] arrayFist = {1,2,3,4,5};
        int [] arrayLast = {6,7,8,9,0};
        int [] newArray;
        int newArrLength = arrayFist.length + arrayLast.length;
        newArray = new int[newArrLength];
        System.arraycopy(arrayFist,0,newArray,0,arrayFist.length);
        System.arraycopy(arrayLast,0,newArray,arrayFist.length,arrayLast.length);
        System.out.println(Arrays.toString(newArray));



    }
}
