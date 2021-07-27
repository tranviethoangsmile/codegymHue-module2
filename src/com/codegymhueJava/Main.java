package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double money,month,interest;
        Scanner input = new Scanner(System.in);
        System.out.println("input money:");
        money = input.nextDouble();
        System.out.println("input month: ");
        month = input.nextDouble();
        System.out.println("input interest");
        interest = input.nextDouble();
        double interestRate = money * (interest/100)/12 *month;
        System.out.println("money: " + money
                + " " + "interest: " + interest + " "
                + "month " + month + " = " + interestRate);

    }
}
