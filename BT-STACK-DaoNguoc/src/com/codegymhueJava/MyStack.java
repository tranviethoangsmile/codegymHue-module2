package com.codegymhueJava;

import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {
        Stack <Integer> stackInteger = new Stack<>();
        stackInteger.push(5);
        stackInteger.push(4);
        stackInteger.push(3);
        stackInteger.push(2);
        stackInteger.push(1);

        System.out.println("Array: ");
        for (Integer i : stackInteger) {
            System.out.print(i + " ");
        }

        System.out.println("\nArray after: ");

        while (!stackInteger.isEmpty()) {
            System.out.print(stackInteger.pop() + " ");
        }


        String fist = "CODEGYM";
        Stack <Character> stackString = new Stack<>();

        System.out.println("\nArray Fist: " + fist);
        for(int i = 0; i < fist.length(); i++) {
            stackString.push(fist.charAt(i));
        }
        System.out.println("Array Last:");

        while (!stackString.isEmpty()) {
            System.out.print(stackString.pop() + " " );
        }




    }
}
