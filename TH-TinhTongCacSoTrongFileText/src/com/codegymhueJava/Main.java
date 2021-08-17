package com.codegymhueJava;

import java.io.*;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {



    public static void main(String[] args) throws IOException {
        try {
            FileWriter file = new FileWriter("file.txt");
            BufferedWriter bw = new BufferedWriter(file);
            bw.write("1");
            bw.newLine();
            bw.write("2");
            bw.newLine();
            bw.write("3");
            bw.newLine();
            bw.write("4");
            bw.newLine();
            bw.write("5");
            bw.close();
            file.close();
        }catch (IOException e) {
        }
        try {
            FileReader file = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(file);
            int total = 0;
            String line = "";
            while ((line = br.readLine()) != null) {
                total += Integer.parseInt(line);
            }
            System.out.println("total: " + total);


        }catch (Exception e) {}


    }
}
