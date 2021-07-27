package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Tính số ngày trong tháng");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ennter month: ");
        int month = scanner.nextInt();
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng " + month + " Có 31 ngày");
                break;
            case 2:
                System.out.println("tháng " + month + " Có 28 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng " + month + " Có 30 ngày");
                break;
        }


    }
}
