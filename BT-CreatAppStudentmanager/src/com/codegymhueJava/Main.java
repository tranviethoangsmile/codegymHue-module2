package com.codegymhueJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void deleteWithName(String name, ArrayList<Object> arrayList ) {
        for (Object i : arrayList) {
            if(arrayList.get((int) i) == name) {
                arrayList.remove(i);
            }
        }
    }

    public static void addStudent(ArrayList<Object> arrayList){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Code: ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        Students student = new Students(name, code, address);
        arrayList.add(student);

    }

    public static void displayStudentList(ArrayList<Object> arrayList) {
        for(Object i:arrayList) {
            System.out.println(i + " ");
        }
    }

    public static void deleteElement(int index, ArrayList<Object> arrayList) {
        arrayList.remove(index);
    }



    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
//        System.out.print("input size: ");
//       int size = sc.nextInt();
//
//       ArrayList<Integer> arrayList = new ArrayList<Integer>(size);
//       for (int i = 0; i < size; i++) {
//           System.out.print("Enter num: ");
//           arrayList.add(sc.nextInt());
//       }
//
//        System.out.println("Array old");
//        for(Integer i : arrayList) {
//            System.out.print(i + " ");
//        }
//
//        ArrayList <Integer> newArray = new ArrayList<Integer>();
//
//        for(int i = 0; i < arrayList.size(); i++) {
//            if (!newArray.contains(arrayList.get(i))) {
//                newArray.add(arrayList.get(i));
//            }
//        }
//
//        System.out.println("\nNew Array List");
//        for (Integer i : newArray) {
//            System.out.print(i + " ");
//        }

        ArrayList<Object> studentList = new ArrayList<Object>();
        Main obj = new Main();
        while (true) {
            System.out.println("-----MENU-----");
            System.out.println("1.ADD NEW STUDENT \n2.EDIT STUDENT \n3.DELETE STUDENT \n4.DISPLAY LIST \n0.EXIT");
            System.out.println("-----END-----");
            System.out.println("input choices: ");
            int choices = sc.nextInt();
            sc.nextLine();
            switch (choices) {
                case 1:
                   obj.addStudent(studentList);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Input index: ");
                    int index = sc.nextInt();
                    obj.deleteElement(index,studentList);
                    break;
                case 4:
                    System.out.println("----Student List----");
                    obj.displayStudentList(studentList);
                    break;
                case 0:
                    System.exit(0);
                    break;

            }

        }
    }
}
