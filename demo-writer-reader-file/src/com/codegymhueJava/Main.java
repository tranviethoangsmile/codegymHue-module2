package com.codegymhueJava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Students std = new Students("A",20,"hue");
        Students std1 = new Students("B",20,"DA");
        Students std2 = new Students("C",20,"DN");
        Students std3 = new Students("D",20,"QN");
        Students std4 = new Students("E",20,"QT");
        List<Students> students = new ArrayList<Students>();
        students.add(std);
        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);

        try {
            FileWriter fileStudents = new FileWriter("FileStudent.txt");
            BufferedWriter bw = new BufferedWriter(fileStudents);
            for(Students o : students) {
                bw.write(o.toString());
                bw.newLine();
            }
            fileStudents.close();
            bw.close();


        }catch (Exception e) {
        }

    }
}
