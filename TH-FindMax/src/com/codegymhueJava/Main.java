package com.codegymhueJava;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List <String> list = new ArrayList<String>();
        list.add("1");
        list.add("10");
        list.add("16");
        list.add("14");
        list.add("18");
        list.add("10");
        list.add("12");
        list.add("11");
        list.add("15");
        list.add("17");

        saveData(list);

        List <Integer> listInters = readData();
        int max = findMax(listInters);
        try {
            FileWriter file = new FileWriter("result.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(file);
            bufferedWriter.write(String.valueOf(max));
            bufferedWriter.close();
            file.close();
        }catch (Exception e) {
            System.out.println("file not avaiable");
        }



    }

    public static void saveData(List <String> list) {
        try {
            FileWriter fw = new FileWriter ("listInteger.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for(String i : list) {
                bw.write(i);
                bw.newLine();
            }
            bw.close();
            fw.close();

        }catch (Exception e){
            System.out.println("error");
        }
    }

    public static List <Integer> readData() {
        List<Integer> listNumber = new ArrayList<>();
        try {
            FileReader fr = new FileReader("listInteger.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                listNumber.add(Integer.parseInt(line));
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listNumber;
    }


    public static int findMax ( List<Integer> listNumber) {
        int max = listNumber.get(0);
        for(int i = 1; i < listNumber.size(); i++) {
            if( max < listNumber.get(i)) {
                max = listNumber.get(i);
            }
        }
        return max;
    }


}
