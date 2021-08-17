package com.codegymhueJava;

public class National {
    private int id;
    private String code;
    private String name;
    public static int count = 0;

    public National() {
    }

    public National(String code, String name) {
        this.id = ++count;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ", " + code + ", " + name;
    }
}
