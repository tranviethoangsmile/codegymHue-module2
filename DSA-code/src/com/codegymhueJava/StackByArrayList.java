package com.codegymhueJava;

import java.util.ArrayList;

public class Stack <E> {

    private ArrayList<E> element = new ArrayList<>();

    public void push(E e) {
        element.add(e);
    }

    public E pop() {
        if (element.size() == 0)
            return null;
        return element.remove(element.size() - 1);
    }

    public E peek () {
        if(element.isEmpty()) {
            return null;
        }
        return element.get(element.size() - 1);
    }

    public boolean isEmpty() {
       if(element.size() == 0)
           return true;
       return false;
    }



    public void printStack () {
        System.out.println(element.toString());
    }

}
