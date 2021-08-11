package com.codegymhueJava;

public class GenericStackClient {

    static void stackOfIStrings() {
        MygenericStack <String> stack = new MygenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());

    }

    static void stackOfIntegers() {
        MygenericStack<Integer> stackInteger = new MygenericStack();
        stackInteger.push(5);
        stackInteger.push(4);
        stackInteger.push(3);
        stackInteger.push(2);
        stackInteger.push(1);
        System.out.println("2.1. Size of stackInteger after push operations: " + stackInteger.size());
        System.out.printf("2.2. Pop elements from stackInteger : ");
        while (!stackInteger.isEmpty()) {
            System.out.printf(" %d", stackInteger.pop());
        }
        System.out.println("\n3.3 Size of stackInteger after pop operations : " + stackInteger.size());
    }
}
