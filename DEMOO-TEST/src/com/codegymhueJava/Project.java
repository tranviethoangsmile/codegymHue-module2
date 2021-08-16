package com.codegymhueJava;

public class Project {

    String name;

    public int getSalary() {
        int workingDay = 20;
        int salary = 40000;
        int pay = salary * workingDay;
        return pay;
    }
    public String getName(){
        return name;
    }

}
