package com.codegymhueJava;

public class Main {

    public static void main(String[] args) {
	Student test = new Student();
	test.setName("Nguyễn văn A");
	test.setClasses("C621H1");
        System.out.println("NAME: " + test.getName() + "\nClass: " + test.getClasses());
    }
}
