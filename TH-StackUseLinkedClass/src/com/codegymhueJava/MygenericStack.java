package com.codegymhueJava;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MygenericStack <T> {
   private LinkedList <T> stack;

   public MygenericStack () {
       stack = new LinkedList ();
   }

   public void push (T element) {
       stack.addFirst(element);
   }

   public T pop () {
       if(isEmpty()) {
           throw new EmptyStackException();
       }
       return stack.removeFirst();
   }

   public int size() {
       return stack.size();
   }

   public boolean isEmpty() {
       if(stack.size() == 0){
           return true;
       }
       return false;

   }
}
