package com.codegymhueJava;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int numNodes;

    public MyLinkedList () {

    }

    public MyLinkedList(Object data) {
        head = new Node (data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node (Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add (int index, Object e) {
        if (index == 0) {
            addFirst(e);
        }else if (index == numNodes) {
            addLast(e);
        }else {
            Node temp = head;
            Node holder;
            for(int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(e);
            (temp.next).next = holder;
            numNodes++;
        }
    }

    void addLast(Object e) {
        Node temp = head;
        Node holder = new Node(e);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = holder;
        numNodes++;
    }

    void addFirst(Object e) {
        Node temp = new Node(e);
        temp.next = head;
        head = temp;
        numNodes++;
    }

    public boolean remove(Object o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.next.getData() == o) {
                Node holder = temp;
                temp = temp.next;
                holder.next = temp.next;
                numNodes--;
                return true;
            }

        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public boolean contains(Object o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData() == o)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(Object o) {
        Node temp = head;
        int serial = 0;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData() == o) {
                serial = i;
                break;
            }
            temp = temp.next;
        }
        return serial;
    }

    public boolean add(Object e) {
        tail.next = new Node(e);
        tail = tail.next;
        numNodes++;
        return true;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (Node) temp.getData();
    }

    public Object getFirst()     {
        return head.getData();
    }

    public Object getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public void clear() {
        head = null;
        tail = null;
        numNodes = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + "\t");
            temp = temp.next;
        }
    }

}
