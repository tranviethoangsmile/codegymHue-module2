package com.codegymhueJava;

import java.util.Scanner;

public class CountChar {
    static Scanner sc = new Scanner(System.in);

    public static String inputString() {
        String stringInput = "";
        System.out.println("Input String: ");
        stringInput = sc.nextLine();
        return stringInput;
    }

    public static char inputChar () {
        char charInput = 0;
        System.out.println("input char: ");
        charInput = sc.next().charAt(0);
        return  charInput;
    }

    public static int checkCharacter (String input, char value) {
        int count = 0;
        int length = input.length();
        char char_input = value;
        for (int i = 0; i < length; i++ ) {
            if(input.charAt(i) == char_input) {
                count++;
            }
        }
        return count;
    }



}
