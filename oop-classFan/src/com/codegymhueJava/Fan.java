package com.codegymhueJava;

public class Fan {
    public int speed;
    public double radius;
    public String color;
    public boolean onOff;

    public Fan(){
        this.speed = 1;
        this.radius = 5d;
        this.color = "blue";
        this.onOff = true;
    }



    public void setFanSpeed(int speed){
        this.speed = speed;
    }
    public int getFanSpeed(){
        return this.speed;
    }
    public void setFanRadius(double radius){
        this.radius = radius;
    }
    public double getFanRadius(){
        return this.radius;
    }
    public void setFanColor(String color){
        this.color = color;
    }
    public String getFanColor(){
        return this.color;
    }
    public void setOnOff(boolean onOff){
        this.onOff = onOff;
    }
    public boolean getOnOff(){
        return this.onOff;
    }

    public String fanInfo(){
        if(this.getOnOff() == true){
            return "Fan " + "\nColor: " + this.color + "\nSpeed: " + this.speed + "\nRadius: " + this.radius +
                    "\nFan is On";
        }
        return "Fan "+ "\nColor: " + this.color + "\nRadius: " + this.radius +
                "\nFan is OFF";

    }

}