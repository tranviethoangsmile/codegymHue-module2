package com.codegymhueJava;

import java.util.LinkedList;

public class QueueByLinkedListOfJava <E>{
    LinkedList<E> queue = new LinkedList<>();

    public void add(E e) {
        queue.add(e);
    }

    public void offer (E e) {
        queue.add(e);
    }

    public E peek() {
        return queue.get(0);
    }

    public E element() {
        return queue.peek();
    }

    public E poll() {
        E ele = queue.get(0);
        queue.remove(0);
        return ele;
    }
    public E remove () {
        return poll();
    }

    public void clear() {
        queue.clear();
    }

    public boolean isEmpty() {
        if(queue.size() == 0)
            return true;
        return false;
    }

    public boolean contains (E e) {
        for (E i : queue) {
            if (i.equals(e)){
                return true;
            }
        }
        return false;
    }

    public int size() {
        return queue.size();
    }

    public void printQueue() {
        for (E i : queue) {
            System.out.println(i + " ");
        }
    }


}
