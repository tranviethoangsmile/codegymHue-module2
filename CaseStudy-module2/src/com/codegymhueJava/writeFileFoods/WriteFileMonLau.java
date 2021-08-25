package com.codegymhueJava.writeFileFoods;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileMonLau {
    public static <E> void writeFileMonLau(List<E> listName) {
        try {
            FileWriter file = new FileWriter("monLauFile.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(file);
            for (E e : listName) {
                bufferedWriter.write(e.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
