package com.codegymhueJava;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<Student>();
         menu();
          while (true) {
              System.out.println("Chọn: ");
          int selected = sc.nextInt();
          switch (selected){
              case 0:
                  System.exit(0);
                  break;
              case 1:
                  sc.nextLine();
                  System.out.print("Tên: ");
                  String name = sc.nextLine();
                  System.out.print("Địa chỉ: ");
                  String address = sc.nextLine();
                  System.out.println("Tuổi: ");
                  int age = sc.nextInt();
                  Student std = new Student(name,address,age);
                  studentList.add(std);
                  saveData(studentList);
                  break;
              case 2 :
                  readData ();
                  break;
                  default :
                      System.out.println("Vui lòng nhập lại.");

          }
         }


    }

    public static void saveData(ArrayList<Student> name) {
        try {
            FileWriter file = new FileWriter("studentData.txt");
            BufferedWriter bw = new BufferedWriter(file);
            for (Object o : name) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            file.close();



        }catch (Exception e) {

        }
    }

    public static void readData () {
        try {
            FileReader readerFile = new FileReader("studentData.txt");
            BufferedReader br = new BufferedReader(readerFile);
            String line = " ";
            while (true) {
                line = br.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print (ArrayList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public static void menu() {
        System.out.println("....Danh sách chọn.....");
        System.out.println("1.Thêm SV \n2.Hiển Thị Danh sách \n0.Thoát");
        System.out.println("....Kết Thúc.....");
    }
}
