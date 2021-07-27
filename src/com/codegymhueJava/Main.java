package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int rate = 23000;
	int usd;
	Scanner input = new Scanner(System.in);
        System.out.println("input usd:");
        usd = input.nextInt();
        int vnd = usd * rate;
        System.out.println("VNĐ: " + vnd);
    }
}
