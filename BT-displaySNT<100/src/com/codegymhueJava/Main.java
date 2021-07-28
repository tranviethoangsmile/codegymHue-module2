package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int number;
//        Scanner input = new Scanner(System.in);
//        System.out.println("input Number: ");
//        number = input.nextInt();
//        int count = 0;

        for(int i = 0; i < 100; i++){
            if(isPrime(i)){
                System.out.print(i + " ");

            }

        }



    }
    public static boolean isPrime(int number){
        boolean check = true;
        if(number < 2){
            check = false;
        }
            for(int i = 2; i <= Math.sqrt(number);i++){
                if(number % i ==0){
                    check = false;
                    break;
                }else{
                    check = true;
                }
            }

        return check;
    }
}
