package com.codegymhueJava;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<National> list = new ArrayList<National>();
	    list.add(new National("AU","Australia"));
        list.add(new National("CN","China"));
        list.add(new National("AU","Australia"));
        list.add(new National("CN","China"));
        list.add(new National("JP","Japan"));
        list.add(new National("CN","China"));
        list.add(new National("JP","Japan"));
        list.add(new National("TH","Thailand"));



//ghi file csv
       try {
           FileWriter file = new FileWriter("file.csv");
           BufferedWriter bufferedWriter = new BufferedWriter(file);
           for(National o:list){
               bufferedWriter.write(o.toString());
               bufferedWriter.newLine();
           }
           bufferedWriter.close();
           file.close();
       }catch (Exception e) {
           System.out.println("not avaiable");
       }

        List<String> newlist = readFileCSV(new File("file.csv"));

       for(String s : newlist) {
           System.out.println(s);
       }
    }

    public static List<String> readFileCSV(File file){
        List<String> list = new ArrayList<String>();
        String line = null;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine()) != null) {
                String [] arr = line.split(", ");
                for(int i = 0; i < arr.length; i++) {
                    list.add(arr[i]);
                }
            }
        }catch (Exception e) {
        }

        return list;

    }
}
