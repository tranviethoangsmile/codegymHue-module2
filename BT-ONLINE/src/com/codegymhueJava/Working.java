package com.codegymhueJava;

public class BtOnline {
   private String name;
   private double code;
   private double price;
   private String brand;

    public BtOnline() {
    }

    public BtOnline(String name,double code,double price,String brand) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return 
    }
}
