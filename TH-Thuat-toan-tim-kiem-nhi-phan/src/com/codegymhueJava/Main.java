package com.codegymhueJava;

public class Main {

    public static void main(String[] args) {
        int [] num = {3,7,8,9,4,6,3,2,1,0,6,4,2,4,6,7};

        System.out.println("Arr: ");
        for (int i : num) {
            System.out.print(i + " ");
        }

        System.out.println("\nArr after Sort: ");

        for (int i : sort(num)) {
            System.out.print(i + " ");
        }

        System.out.println("\n10 có trong mảng: " + searchBinary(num,10));
        System.out.println("20 có trong mang: " + searchBinary(num,20));
        System.out.println("1 có trong mảng: " + searchBinary(num,1));

    }

    public static int [] sort(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(temp > arr[j]){
                    arr[i] = arr[j];
                    arr[j] = temp;
                    temp = arr[i];
                }
            }
        }
        return arr;
    }


    public static boolean searchBinary(int [] arr, int value) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == value) {
                return true;
            }else if(arr[mid] > value) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return false;
    }
}
