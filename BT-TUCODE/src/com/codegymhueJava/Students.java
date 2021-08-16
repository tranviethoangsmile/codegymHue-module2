package com.codegymhueJava;

public class Students {
    private String name;
    private int code;
    private String address;

    public Students() {
    }

    public Students(String name,int code,String address) {
        this.name = name;
        this.code = code;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%20s%10d%20s",name,code,address);
    }
}
