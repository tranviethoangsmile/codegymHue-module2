package com.codegymhueJava.custorm;

public class FoodsObj {
    private String name;
    private int quantity;
    private int price;

    public FoodsObj() {
    }

    public FoodsObj(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
       return String.format("%20s%10d%10d",name,quantity,price);
    }
}
