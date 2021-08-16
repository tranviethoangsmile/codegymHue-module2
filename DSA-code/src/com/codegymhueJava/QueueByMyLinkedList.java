package com.codegymhueJava;

public class QueueByMyLinkedList <E>{
    MyLinkedList <E> queue = new MyLinkedList<E>();

    public void add(E e) {
        queue.addFirst(e);
    }

    public void offer(E e) {
        queue.addFirst(e);
    }

    public E peek() {
      return (E) queue.getFirst();
    }

    public E element() {
        return (E) queue.getFirst();
    }

    public E poll () {
        E ele = (E) queue.get(0);
        queue.remove(queue.get(0));
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
        return queue.contains(e);
    }

    public int size() {
        return queue.size();
    }

    public void printQueue () {
        queue.printList();
    }




}
