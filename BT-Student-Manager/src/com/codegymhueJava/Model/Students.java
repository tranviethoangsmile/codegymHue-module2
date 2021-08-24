package com.codegymhueJava.Model;

public class Students {
    private String name;
    private String id;
    private double oralTest;
    private double test15;
    private double test45;
    private double semesterTest;
    public static int count = 0;

    public Students () {

    }

    public static String autoId() {
        count++;
        return "CG" +  count;
    }

    public Students (String name, double oralTest, double test15, double test45,double semesterTest) {
        this.name = name;
        this.id = autoId();
        this.oralTest = oralTest;
        this.test15 = test15;
        this.test45 = test45;
        this.semesterTest = semesterTest;
    }

    public int getMedium () {
        int medium = (int) ((oralTest + test15 + (test45 * 2) + (semesterTest * 3))/7);
        return medium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOralTest() {
        return oralTest;
    }

    public void setOralTest(double oralTest) {
        this.oralTest = oralTest;
    }

    public double getTest15() {
        return test15;
    }

    public void setTest15(double test15) {
        this.test15 = test15;
    }

    public double getTest45() {
        return test45;
    }

    public void setTest45(double test45) {
        this.test45 = test45;
    }

    public double getSemesterTest() {
        return semesterTest;
    }

    public void setSemesterTest(double semesterTest) {
        this.semesterTest = semesterTest;
    }

    public String toString() {
        return String.format("%5s%20s%10f%10f%10f%10f%10d",id,name,oralTest,test15,test45,semesterTest,this.getMedium());
    }

}
