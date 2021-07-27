package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Giải Phương trình bậc nhất");
        System.out.println("Phương trình có dạng ax + b = c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        double a = scanner.nextDouble();
        System.out.println("ennter b:");
        double b = scanner.nextDouble();
        System.out.println("ennter c");
        double c = scanner.nextDouble();;
        if(a !=0){
            double nghiem = (b + c)/a;
            System.out.println("X = "+ nghiem);
        }else{
            if(b == c){
                System.out.println("Phương trình có vô số nghiệm");
            }else{
                System.out.println("Phuong trình không có nghiệm");
            }
        }



    }
}
