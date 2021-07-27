package com.codegymhueJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listOnes = new ArrayList<String>();
        listOnes.add("zero");
        listOnes.add("one");
        listOnes.add("two");
        listOnes.add("three");
        listOnes.add("four");
        listOnes.add("five");
        listOnes.add("six");
        listOnes.add("seven");
        listOnes.add("eight");
        listOnes.add("nine");
        listOnes.add("ten");



        ArrayList<String> listTens = new ArrayList<String>();
        listTens.add("ten");
        listTens.add("eleven");
        listTens.add("twelve");
        listTens.add("thirteen");
        listTens.add("fourteen");
        listTens.add("fifteen");
        listTens.add("sixteen");
        listTens.add("seventeen");
        listTens.add("eighteen");
        listTens.add("nineteen");
        listTens.add("twenty");



        ArrayList<String> listTys = new ArrayList<String>();
        listTys.add("");
        listTys.add("");
        listTys.add("twenty");
        listTys.add("thirty");
        listTys.add("fourty");
        listTys.add("fifty");
        listTys.add("sixty");
        listTys.add("senventy");
        listTys.add("eighty");
        listTys.add("ninety");


        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1 >> 99:");
        number = input.nextInt();
        if(number <= 10){
            System.out.println(listOnes.get(number));
        }else if(number < 20){
            int num = number%10;
            System.out.println((listTens.get(num)));
        }else if(number ==20){
            System.out.println((listTens.get(10)));
        }else{
            int ty = number/10;
            int one = number%10;
            System.out.println(listTys.get(ty) + " " + listOnes.get(one));
        }
    }
}
