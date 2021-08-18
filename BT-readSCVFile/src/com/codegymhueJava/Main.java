package com.codegymhueJava;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

        List<National> newlist = readFileCSV(new File("file.csv"));

       for(National s : newlist) {
           System.out.println(s);
       }
    }

    public static List<National> readFileCSV(File file){
        List<National> list = new ArrayList<>();
        String line = null;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine()) != null) {
                String [] arr = line.split(", ");
               String code = arr[1];
               String name = arr[2];
               list.add(new National(code,name));
            }
        }catch (Exception e) {
        }

        return list;

    }
}
