package com.codegymhueJava.Thread;

public class Sale extends Thread {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    String [] sale = {"H","Ô","M"," ","N","A","Y"," ","Đ","Ư","Ợ","C"," ","T","Ặ","N","G"," ","1"," ","C","H","A","I"," ","B","I","A"," ","N","Ế","U"," ","Q","U","Ý"," ","K","H","Á","C","H"," ","T","H","Í","C","H"," ","U","Ố","N","G"," ","B","I","A"," ","<3"," ","<3"," ","<3"};
    int leng = sale.length;
    @Override
    public void run() {
        for(int i = 0; i < leng; i++) {
            System.out.print(ANSI_CYAN  + sale[i] + ANSI_RESET);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
