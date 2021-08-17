package com.codegymhueJava;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static List<String> copyData(File file) {
		List<String> data = new ArrayList<>();
		try {
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			FileWriter fw = new FileWriter("taget.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			fw.close();
			br.close();
			reader.close();

		}catch (Exception e) {

		}
		return data;
	}

    public static void main(String[] args) {
	    List<String> list = new ArrayList<String>();
	    list.add("hoang");
	    list.add("tam");
	    list.add("van");

	    try {
	        FileWriter file = new FileWriter("soureFile.txt");
	        BufferedWriter bufferedWriter = new BufferedWriter(file);
	        for(String o : list) {
	            bufferedWriter.write(o);
	            bufferedWriter.newLine();
            }
	        bufferedWriter.close();
	        file.close();

	    }catch (Exception e) {
            System.out.println("file not ");
	    }


	    copyData(new File("soureFile.txt"));

    }

}
