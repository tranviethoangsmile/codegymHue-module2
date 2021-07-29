package com.codegymhueJava;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 	int [] arrNumber = {1,2,3,4,5,6,7,8,9,0};
	 	for(int x: arrNumber){
			System.out.print(x + " ");
		}
		int num;
		Scanner inputValue = new Scanner(System.in);
		System.out.println("\ninput Num: ");
		num = inputValue.nextInt();
		int local = 0;
		for(int i = 0; i < arrNumber.length; i ++){
	    	if(num == arrNumber[i]){
	    		local = i;
				System.out.println("số cần tìm ở vị trí: " + local);
       		 }
			System.out.println("không tìm thấy");
	    	break;
        }

		for ( int j = local; j < arrNumber.length - 1; j++){
			arrNumber[j] = arrNumber[j + 1];
		}
		System.out.println("Mảng sau khi xóa phần tử: ");

		for ( int x:arrNumber){
			System.out.print(x + " ");
		}

//		tạo mảng
//		Scanner sc = new Scanner(System.in);
//		int size;
//		int value;
//		int [] arrayNum;
//		System.out.println("input size: ");
//		size = sc.nextInt();
//		arrayNum = new int[size];
//		for(int i = 0; i < size; i++){
//			System.out.println("input value: ");
//			value = sc.nextInt();
//			arrayNum[i] = value;
//		}
//		for(int i = 0 ; i < arrayNum.length; i++){
//			System.out.println(arrayNum[i]);
//		}




    }
}
