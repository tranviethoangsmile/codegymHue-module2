package com.codegymhueJava;

public class Students {
    private String name;
    private double maths;
    private double physics;
    private double chemistry;
    private double english;

    public Students() {
    }

    public Students(String name, double toan, double ly, double hoa, double anh) {
        this.name = name;
        this.maths = toan;
        this.physics = ly;
        this.chemistry = hoa;
        this.english = anh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaths() {
        return maths;
    }

    public void setMaths(double maths) {
        this.maths = maths;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getMediumScore () {
        return (getMaths() + getPhysics() + (getChemistry() * 2) + (getEnglish() * 3)) / 7;
    }

    @Override
    public String toString() {
        return String.format("%20s%15f%15f%15f%15f%15f",name, maths, physics, chemistry, english,getMediumScore());
    }




}
