package com.codegymhueJava.persentation;


import com.codegymhueJava.Model.Students;
import com.codegymhueJava.Thread.Loading;
import com.codegymhueJava.Thread.Update;
import com.codegymhueJava.service.CheckInput;
import com.codegymhueJava.service.Service;

import java.io.*;
import java.util.*;


public class Main {
    static Loading loading = new Loading();
    static Update update = new Update();
    static CheckInput check = new CheckInput();
    static Service sv = new Service();
    static List<Students> studentList = new ArrayList<Students>();
    public static void main(String[] args) throws InterruptedException {
        while(true){
            sv.menu();
            System.out.print("select: ");
            int choice = check.checkInteger(0,8);
            switch (choice) {
                case 0 :
                    System.exit(0);
                case 1 :
                    sv.addNewStudent();
                    break;
                case 2 :
                    sv.showList();
                    break;
                case 3 :
                    sv.delete();
                    break;
                case 4 :
                    sv.edit();
                    break;
                case 5 :
                    sv.rank();
                    break;
                case 6 :
                    saveData(studentList);
                    break;
                case 7 :
                    readData();
                    break;
                case 8 :
                    sv.showListWithName();
                    break;

            }
        }
    }


    public static void saveData ( List<Students> studentList) throws InterruptedException {
//        update.start();
//        update.join();
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

    public static void readData() throws InterruptedException {
//        loading.start();
//        loading.join();
//        List<Students> students = new ArrayList<>();
        String line;
        try {
            FileReader file = new FileReader("studentList.txt");
            BufferedReader br = new BufferedReader(file);
            sv.tableShow();
            do {
                line =  br.readLine();
                System.out.println(line);

            }while (line != null);
            br.close();
            file.close();

        }catch (Exception e) {

        }

    }
}
