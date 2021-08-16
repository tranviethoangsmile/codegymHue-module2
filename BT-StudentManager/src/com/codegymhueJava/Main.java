package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckInput check = new CheckInput();
        System.out.println("input num: ");
        int a = check.getInteger(0,10);

        double b = check.getDouble(0,10);
        System.out.println("nhập string: ");
        String c = check.getString();



    }
}
