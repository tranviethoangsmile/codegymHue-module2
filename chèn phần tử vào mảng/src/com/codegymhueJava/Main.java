package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int [] arrNumber = {1,2,3,4,5,7,8,9,0};
        System.out.print("Mảng trước khi chèn: ");
        for(int x:arrNumber){
            System.out.print(x + " ");
        }

        Scanner sc = new Scanner(System.in);
	    int index;
	    int value;
	    do{
            System.out.println("\ninput index: ");
            index = sc.nextInt();
        }while(index < 0 || index > arrNumber.length);
        System.out.println("input value: ");
	    value = sc.nextInt();

	   for(int i = arrNumber.length - 1; i > index; i-- ){
	       arrNumber[i] = arrNumber[i -1];

       }
	   arrNumber[index] = value;

        System.out.println("\nhàm sau khi chèn: ");
	   for(int k:arrNumber) {
           System.out.print(k + " ");
       }




    }
}
