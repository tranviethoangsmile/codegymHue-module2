package com.codegymhueJava;

import java.util.ArrayList;
public class MyListTest {

    public static void main(String[] args) {
        int size = 10;

        ArrayList<Integer> arrayNew = new ArrayList<>(size);
        for( int i = 0; i < size ; i ++) {
            arrayNew.add(i);
        }

        ArrayList<Integer> array = new ArrayList<>(size);
        for( int i = 0; i < size ; i ++) {
            array.add(i);
        }

        System.out.println("My Array: " );
        for(int x: array){
            System.out.print(x + " " );

        }

        System.out.print("\nSize of MyAnray: "+ array.size());

        array.add(10);

        System.out.println("\narray after add 10: ");
        for(int x: array){
            System.out.print(x + " " );
        }

        System.out.println("\nSize of array after add: " + array.size());

        array.add(2,15);
        System.out.println("Array after add Element 15 with index = 2: ");
        for(int x: array){
            System.out.print(x + " " );
        }

        System.out.println("\nElement have index = 5 is : "  + array.get(5));

        array.remove(4);

        System.out.println("Array after remove element have index 5 is : ");
        for(int x: array){
            System.out.print(x + " " );
        }


        System.out.println("\nArrayNew: ");
        for(int k : arrayNew) {
            System.out.print(k + " ");
        }

        array.addAll(arrayNew);

        System.out.println("Array after addall arrayNew: ");

        for(int x: array){
            System.out.print(x + " " );
        }

        System.out.println("\nSize of array after addAll: " + array.size());

        System.out.println("int Array have element 11? "  +  array.contains(11));

        System.out.println("int Array have element 15? "  +  array.contains(15));

        array.set(0,-1);
        System.out.println("update -1 with index is 0: ");
        for(int x: array){
            System.out.print(x + " " );
        }


        array.clear();
        System.out.println("Size off Array after clear: ");
        System.out.println("\nSize of array after Clear: " + array.size());

















    }

}
