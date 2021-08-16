package com.codegymhueJava;

public class StackByMyLinkedList <E> {
    MyLinkedList<E> stack = new MyLinkedList<E>();

    public void push (E e) {
        stack.addLast(e);
    }

    public void peek() {
        System.out.println(stack.getLast());
    }

    public int size() {
        return stack.size();
    }

    public void pop() {
        System.out.println(stack.getLast());
        stack.remove(stack.size() - 1);
    }

    public int search (E e) {
        return stack.indexOf(e);
    }

    public void printStack () {
       stack.printList();

    }

}
