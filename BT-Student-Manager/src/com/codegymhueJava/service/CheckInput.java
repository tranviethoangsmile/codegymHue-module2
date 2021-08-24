package com.codegymhueJava.service;

import java.io.EOFException;
import java.util.Scanner;

public class CheckInput {
    Scanner scanner = new Scanner(System.in);

    public int checkInteger (int min, int max) {
        int num = 0;
        while (true) {
            try {
                num = Integer.parseInt(scanner.nextLine());
                if(num >= min && num <= max){
                    break;
                }else {
                    System.err.println("please try again within: " + min + "-" + max);
                }

            }catch (Exception e) {
                System.out.println("please Input datatype is Integer");
            }

        }
        return num;
    }


    public double checkDouble (int min, int max) {
        double num = 0;
        while (true) {
            try {
                num = Double.parseDouble(scanner.nextLine());
                if(num >= min && num <= max){
                    break;
                }else {
                    System.err.println("please try again within: " + min + "-" + max);
                }
            }catch (Exception e) {
                System.out.println("please Input datatype is Double");
            }
        }
        return num;
    }



    public String checkString () {
        String st;
        while (true) {
            try {
                st = scanner.nextLine();
                if(!st.trim().isEmpty()){
                    break;
                }else {
                    System.err.println("please Input Try again...");
                }

            }catch (Exception e) {
                System.out.println("please Input datatype is String");
            }


        }
        return st;
    }


}
