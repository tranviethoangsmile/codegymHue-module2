package com.codegymhueJava;

public class MyLinkedListTest {

    public static void main(String[] args) {
        System.out.println("/-/-/-/-/-/TEST/-/-/-/-/-/-");
        MyLinkedList linked = new MyLinkedList(10);
        linked.addFirst(11);
        linked.addFirst(12);
        linked.addFirst(13);

        linked.add(4,9);
        linked.add(4,9);
        linked.printList();
    }
}
