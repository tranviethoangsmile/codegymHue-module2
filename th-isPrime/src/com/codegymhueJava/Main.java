package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        boolean  check = true;
        Scanner input = new Scanner(System.in);
        System.out.println("input number: ");
        number = input.nextInt();
        if(number < 2){
            System.out.println(number + "not is prime");
        }else{
            for(int i = 2; i <= Math.sqrt(number);i++){
                if(number % i == 0){
                    check = false;
                    break;
                }else{
                    check = true;
                }
            }
        }
        if(check){
            System.out.println(number + "is prime");
        }else{
            System.out.println(number + "not is prime");
        }



    }
}
