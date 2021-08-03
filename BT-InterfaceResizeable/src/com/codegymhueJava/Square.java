package com.codegymhueJava;

public class Square extends Shape{
    private double side=1.0;

    public Square() {

    }

    public Square(double side){
        this.side=side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side){
        this.side=side;
    }

    @Override
    public String toString(){
        return "A square with side = "+getSide()+", which is a subclass of "+super.toString();
    }

    @Override
    public void resize(double percent) {
        this.side=(this.side*(percent/100));
    }
}
