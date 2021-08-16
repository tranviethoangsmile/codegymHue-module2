package com.codegymhueJava;

public class Main {

    public static void main(String[] args) {
//        select sort
        int [] arr = {6,2,5,7,8,9,1};
//        for(int i = 0; i < arr.length; i++) {
//            int temp = arr[i];
//            for(int j = i+ 1; j < arr.length; j++) {
//                if(temp > arr[j]) {
//                   arr[i] = arr[j];
//                   arr[j] = temp;
//                   temp = arr[i];
//                }
//                System.out.print("\nstep i ="   + arr[i] +  " j = " + arr[j] + " : ");
//                for(int k:arr){
//                    System.out.print(k + " ");
//                }
//            }
//        }

//        for (int i = 0; i < arr.length; i++) {
//            for(int j = arr.length -1; j > i; j--) {
//                int temp = arr[j];
//                if (arr[j] < arr[j-1]){
//                    arr[j] = arr[j-1];
//                    arr[j - 1] = temp;
//                }
//            }
//        }
        System.out.println("befor: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }

// insertSort
        for(int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int pos = i;
            while (pos > 0 && min < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }

            arr[pos] = min;
            System.out.print("\nstep min ="   + arr[i] +  " pos = " + arr[pos] + " : ");
            for(int k:arr) {
                System.out.print(k + " ");
            }
        }
        System.out.print("\narr after: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }

//for (int i = 0; i < arr.length; i++) {
//    for (int j = arr.length - 1; j > i; j-- ) {
//        int temp = arr[j];
//        if(arr[j] < arr[j - 1]){
//            arr[j] = arr[j - 1];
//            arr[j - 1] = temp;
//        }

//    }
//}


//        System.out.print("\nafter: ");
//
//
//        for(int i : arr) {
//            System.out.print(i + " ");
//        }
    }
}
