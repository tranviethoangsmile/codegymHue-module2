package com.codegymhueJava.service;

import com.codegymhueJava.Model.Students;
import com.codegymhueJava.Thread.Loading;
import com.codegymhueJava.Thread.Update;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Service {
    static Loading loading = new Loading();
    static Update update = new Update();
    static CheckInput check = new CheckInput();
    static List<Students> studentList = new ArrayList<Students>();

    public static void showListWithName() throws InterruptedException {
        System.out.println("\ninput name: ");
        String name = check.checkString();
        tableShow();
        for(Students o : studentList) {
            if(o.getName().startsWith(name)) {
                System.out.println(o);
            }
        }
    }

    public static void rank() {
        Collections.sort(studentList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.getMedium() - o2.getMedium();
            }
        });
        tableShow();
        for(Students o : studentList) {
            System.out.println(o.toString());
        }
    }

    public static void edit() {
        int option;
        do {
            menuOptions();
            System.out.print("option: ");
            option = check.checkInteger(0,2);
            switch (option) {
                case 1 :
                    editWithName();
                    break;
                case 2 :
                    editWithStatus();
                    break;
                case 0 :
                    break;
            }
        }while(option != 0);

    }

    private static void editWithStatus() {
        System.out.println("input Status: ");
        int status = check.checkInteger(0, studentList.size()-1);

        System.out.println("new Name: ");
        String newName = check.checkString();
        studentList.get(status).setName(newName);

        System.out.println("Oral Test: ");
        double newOralTest = check.checkDouble(0,10);
        studentList.get(status).setOralTest(newOralTest);

        System.out.println("Test 15': ");
        double newTest15 = check.checkDouble(0,10);
        studentList.get(status).setTest15(newTest15);

        System.out.println("Test 45': ");
        double newTest45 = check.checkDouble(0,10);
        studentList.get(status).setTest45(newTest45);

        System.out.println("Semester Test': ");
        double newSemesterTest = check.checkDouble(0,10);
        studentList.get(status).setSemesterTest(newSemesterTest);

    }

    private static void editWithName() {
        System.out.println("input Name: ");
        String name = check.checkString();
        for(Students student : studentList) {
            if(student.getName().equals(name)){
                System.out.println("new Name: ");
                String newName = check.checkString();
                student.setName(newName);

                System.out.println("Oral Test: ");
                double newOralTest = check.checkDouble(0,10);
                student.setOralTest(newOralTest);

                System.out.println("Test 15': ");
                double newTest15 = check.checkDouble(0,10);
                student.setTest15(newTest15);

                System.out.println("Test 45': ");
                double newTest45 = check.checkDouble(0,10);
                student.setTest15(newTest45);

                System.out.println("Semester Test': ");
                double newSemesterTest = check.checkDouble(0,10);
                student.setTest15(newSemesterTest);

            }
        }
    }

    public static void delete() {
        int option;
        do {
            menuOptions();
            System.out.print("option: ");
            option = check.checkInteger(0,2);
            switch (option) {
                case 1 :
                    deleteWithName();
                    break;
                case 2 :
                    deleteWithStatus();
                    break;
                case 0 :
                    break;
            }
        }while(option != 0);



    }

    private static void deleteWithStatus() {
        System.out.println("input Status: ");
        int status = check.checkInteger(0, studentList.size()-1);
        studentList.remove(status);
    }

    private static void deleteWithName() {
        System.out.println("input name: ");
        String name = check.checkString();
        for(int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getName().equals(name)) {
                studentList.remove(i);
            }
        }
    }

    public static void showList() throws InterruptedException {
        tableShow();
        if(studentList.size() == 0) {
            System.out.println("List isEmpty");
        }
        for(Students o : studentList) {
            System.out.println(o.toString());
        }

    }

    public static void addNewStudent() throws InterruptedException {
        System.out.print("Name: ");
        String name = check.checkString();
        System.out.print("Test Oral: ");
        double oralTest = check.checkDouble(0,10);
        System.out.print("Test 15': ");
        double test15 = check.checkDouble(0,10);
        System.out.print("Test 45': ");
        double test45 = check.checkDouble(0,10);
        System.out.print("semester Test: ");
        double semesterTest = check.checkDouble(0,10);
        update.start();
        update.join();
        System.out.println("100%");
        studentList.add(new Students (name,oralTest,test15,test45,semesterTest));
    }

    public static void menu () {
        System.out.println("\n------MENU------");
        System.out.println("1.Add student \n2.Show List \n3.Delete \n4.Edit \n5.Rank \n6.Save \n7.show File \n8.Find Student \n0.Exit.");
        System.out.println("-------END------");

    }

    public static void menuOptions() {
        System.out.println("---OPTION---");
        System.out.println("1.with name \n2.with status \n0.exit");
        System.out.println("---END----");
    }

    public static void tableShow() {
        System.out.println("\n\tID\t\t\t   |name||Oral Test|  |15'| \t|45'|\t|Semester|   |Medium|");
    }

}
