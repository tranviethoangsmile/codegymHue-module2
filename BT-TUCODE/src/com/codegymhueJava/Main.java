package com.codegymhueJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList <Students> studentsList = new ArrayList<Students>();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("------MENU------");
            System.out.println("1.Add new \n2.Display List \n3. Delete \n4.Edit Element \n0.Exit");
            System.out.println("------END------");
            System.out.println("choice: ");


            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 :
                    System.out.print("Input name: ");
                    String name = sc.nextLine();
                    System.out.print("Input Code: ");
                    int code = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Input Address: ");
                    String address = sc.nextLine();
                    Students student = new Students(name,code,address);
                    studentsList.add(student);
                    break;
                case 2 :
                    for (Students i : studentsList) {
                        System.out.println(i + " ");
                    }

                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                case 0 :
                    System.exit(0);
                    break;

                default:
                    System.out.println("please enter again...!!!");
                    break;
            }

        }

    }
}
