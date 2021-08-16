package com.codegymhueJava;

public class Main {

    public static void main(String[] args) {
        int arr[] = {0,6,4,8,9,3,2,4,1};
        System.out.println("arr Befor sort: ");
        for(int i:arr){
            System.out.print(i + " ");
        }
        insertSort(arr);
        System.out.println("\narr after sort: ");
        for(int i:arr){
            System.out.print(i + " ");
        }

    }

    public static void insertSort(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int pos = i;
            while (pos > 0 && min < arr[pos -1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = min;
        }
    }
}
