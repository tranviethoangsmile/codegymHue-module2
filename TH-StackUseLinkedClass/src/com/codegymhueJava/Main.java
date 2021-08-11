package com.codegymhueJava;

public class Main {

    public static void main(String[] args) {
        GenericStackClient test = new GenericStackClient();
        System.out.println("1. Stack of integers");
            test.stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
            test.stackOfIStrings();
    }
}
