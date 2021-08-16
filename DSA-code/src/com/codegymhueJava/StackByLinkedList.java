package com.codegymhueJava;

import java.util.LinkedList;

public class StackByLinkedList <E> {
    LinkedList<E> stack = new LinkedList<>();

    public void push(E e) {
        stack.add(e);
    }

    public void push(int index, E e) {
        stack.add(index, e);
    }

    public E pop() {
       return (stack.remove(stack.size() - 1));
    }

    public E peek() {
        return stack.get(stack.size() - 1);
    }

    public int search (E str) {
        int count = 0;
        for(int i = 0; i < stack.size(); i++) {
            if(stack.get(i) == str){
                count = i;
            }
        }
        return count;
    }

}
