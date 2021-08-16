package com.codegymhueJava;

public class Main {

    public static void main(String[] args) {
        int [] arr = {0,1,9,7,5,8,3,2,6,2,7,8,9};
        bubbleSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }

    }
    public static void bubbleSort(int [] arr) {
        int leng = arr.length;
        for (int i = 0; i < leng; i++) {
            for (int j = 0; j < leng - 1 - i; j++) {
                int temp = arr[j];
                if(arr[j] > arr[j + 1]) {
                    arr[j] = arr[j +1];
                    arr[j + 1] = temp;
                }

            }
        }

    }
}
