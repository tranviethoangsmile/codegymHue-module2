package com.codegymhueJava;

import com.codegymhueJava.Student.Students;

import java.io.*;
import java.util.*;

public class Main {
    static CheckInput check = new CheckInput();
    static List<Students> studentList = new ArrayList<Students>();
    public static void main(String[] args) {
        while(true){
            menu();
            System.out.print("select: ");
            int choice = check.checkInteger(0,8);
            switch (choice) {
                case 0 :
                    System.exit(0);
                case 1 :
                    addNewStudent();
                    break;
                case 2 :
                    showList();
                    break;
                case 3 :
                    delete();
                    break;
                case 4 :
                    edit();
                    break;
                case 5 :
                    rank();
                    break;
                case 6 :
                    saveData(studentList);
                    break;
                case 7 :
                    readData();
                    break;
                case 8 :
                    showListWithName();
                    break;

            }
        }
    }

    private static void showListWithName() {
        System.out.println("input name: ");
        String name = check.checkString();
        tableShow();
        for(Students o : studentList) {
            if(o.getName().startsWith(name)) {
                System.out.println(o);
            }
        }
    }

    private static void rank() {
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

    private static void edit() {
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

    private static void delete() {
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

    private static void showList() {
        tableShow();
        if(studentList.size() == 0) {
            System.out.println("List isEmpty");
        }
        for(Students o : studentList) {
            System.out.println(o.toString());
        }

    }

    private static void addNewStudent() {
        System.out.print("Name: ");
        String name = check.checkString();
        System.out.print("Test Oral: ");
        double oralTest = check.checkDouble(0,10);
        System.out.print("Test Oral: ");
        double test15 = check.checkDouble(0,10);
        System.out.print("Test 45': ");
        double test45 = check.checkDouble(0,10);
        System.out.print("semester Test: ");
        double semesterTest = check.checkDouble(0,10);
        studentList.add(new Students (name,oralTest,test15,test45,semesterTest));
    }

    public static void saveData ( List<Students> studentList) {
        try {
            FileWriter file = new FileWriter("studentList.txt");
            BufferedWriter bw = new BufferedWriter(file);
            for(Students student : studentList) {
                bw.write(student.toString());
                bw.newLine();
            }
            bw.close();
            file.close();

        }catch (Exception e) {
        }
    }

    public static void readData() {
        List<Students> students = new ArrayList<>();
        String line;
        try {
            FileReader file = new FileReader("studentList.txt");
            BufferedReader br = new BufferedReader(file);
            tableShow();
            do {
                line =  br.readLine();
                System.out.println(line);

            }while (line != null);
            br.close();
            file.close();

        }catch (Exception e) {

        }

    }

    public static void menu () {
        System.out.println("------MENU------");
        System.out.println("1.Add student \n2.Show List \n3.Delete \n4.Edit \n5.Rank \n6.Save \n7.show File \n8.Find Student \n0.Exit.");
        System.out.println("-------END------");

    }

    public static void menuOptions() {
        System.out.println("---OPTION---");
        System.out.println("1.with name \n2.with status \n0.exit");
        System.out.println("---END----");
    }

    public static void tableShow() {
        System.out.println("\tID\t\t\t   |name||Oral Test|  |15'| \t|45'|\t|Semester|   |Medium|");
    }
}
