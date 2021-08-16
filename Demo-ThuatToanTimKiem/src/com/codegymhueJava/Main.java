package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int [] arr = new int[10];
	    Scanner scanner = new Scanner(System.in);

	    for( int i = 0; i < arr.length; ++i) {
            System.out.print("input: ");
	        arr[i] = scanner.nextInt();
        }


        System.out.print("arr: ");
	    for (int i : arr) {
            System.out.print(i + " ");
        }



	    for(int i = 0; i < arr.length; i++) {
	        int temp = arr[i];
	        for (int j = i + 1; j < arr.length; ++j) {
	            if (temp > arr[j]){
	                arr[i] = arr[j];
	                arr[j] = temp;
	                temp = arr[i];
                }
            }
        }

        System.out.println("\nArr sort: " );

	    for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\n10: " + binarySearch(arr,10));
        System.out.println("1:" + binarySearch(arr,1));



    }


    public static boolean binarySearch(int [] arr, int value) {
        int left = 0;
        int right = arr.length - 1;

        while (left <=right) {
            int mid = (left + right)/2;
            if(arr[mid] == value) {
                return true;
            }else if(arr[mid] < value) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return false;

    }





}
