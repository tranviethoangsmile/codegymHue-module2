package com.codegymhueJava;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
   public static <E> void writeFile (String path, List<E>list) {
       try {

           FileOutputStream file = new FileOutputStream(path);
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
           objectOutputStream.writeObject(list);
           objectOutputStream.close();
           file.close();
       }catch (Exception e) {
           e.getMessage();
       }
   }

   public static <E> List<E> readFromFile (String path) {
       List<E> listFromData = new ArrayList<E>();
       try {
           FileInputStream file = new FileInputStream(path);
           ObjectInputStream objectInputStream = new ObjectInputStream(file);
           listFromData = (List<E>) objectInputStream.readObject();

       }catch (Exception e) {
           e.getMessage();
       }
       return listFromData;
   }



    public static void main(String[] args) {
        List<Students> students = new ArrayList<Students>();
        students.add(new Students(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Students(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Students(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Students(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Students(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeFile("studentList.txt",students);
        List <Students> studentsFromFile = readFromFile("studentList.txt");
        for(Students o : studentsFromFile) {
            System.out.println(o);
        }
    }
}
