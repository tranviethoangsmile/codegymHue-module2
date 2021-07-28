package com.codegymhueJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String [] students = {"thu","long","chinh","nguyen","anh","phuong","hoang","hieu","hoa","nhi"};
	    String name;
	    Scanner inputName = new Scanner(System.in);
        System.out.println("input name:");
        name = inputName.nextLine();
        boolean checkName = true;
        for(int i = 0; i < students.length; i++){
            if(students[i].equals(name)){
                System.out.println(name + " có vị trí là: " + (i + 1));
                checkName = true;
                break;
            }
            checkName = false;

        }
        if(!checkName){
            System.out.println(name + " không có trong list");
        }



    }

}
