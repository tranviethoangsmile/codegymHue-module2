package com.codegymhueJava;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint( float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public  MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(){

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setySpeed( float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float [] getSpeed () {
        return new float[] {this.xSpeed,this.ySpeed};
    }

    public String toString() {
        return super.toString() + "," + "speed = " + "(" + getxSpeed() + "," + getySpeed() + ")";
    }

    public MoveablePoint move(){
        super.setX(getX() + getxSpeed());
        super.setY(getY() + getySpeed());
        return this;
    }
}
