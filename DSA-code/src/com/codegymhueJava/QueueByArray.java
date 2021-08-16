package com.codegymhueJava;

import java.util.ArrayList;

public class QueueByArray <E>{
    ArrayList<E> queue = new ArrayList<>();

    public void add(E e) {
        queue.add(e);
    }

    public void offer(E e) {
        queue.add(e);
    }

    public E peek() {
        return queue.get(0);
    }

    public E element() {
        return this.peek();
    }

    public E poll() {
        E element = queue.get(0);
        queue.remove(0);
        return element;
    }

    public E remove () {
        return this.poll();
    }

    public void clear() {
        queue.clear();
    }

    public boolean isEmpty() {
        if(!(queue.size() == 0))
            return false;
        return true;
    }

    public boolean contains(E e) {
        for(E i : queue) {
            if(i == e) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return queue.size();
    }

    public void printQueue() {
        for(E i : queue) {
            System.out.println(i + " ");
        }
    }
}
