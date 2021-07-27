package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Tính chỉ số IBM");
        double weight;
        double height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter weight: ");
        weight = scanner.nextFloat();
        System.out.println("enter Height: ");
        height = scanner.nextFloat();
        double ibm = weight / Math.pow(height,2);
        if(ibm < 18.8){
            System.out.println("ibm ="+ ibm + " Quá gầy");
        }else if(ibm < 25.0){
            System.out.println("ibm ="+ ibm + " cơ thể cân đối");
        }else if(ibm <30){
            System.out.println("ibm ="+ ibm +  " hơi thừa mỡ");
        }else{
            System.out.println("ibm ="+ ibm + " Béo phì");
        }
    }
}
