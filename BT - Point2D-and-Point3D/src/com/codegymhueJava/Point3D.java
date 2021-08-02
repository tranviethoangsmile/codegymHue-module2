package com.codegymhueJava;

public class Point3D extends Point2D {
    public float z;
    public Point3D(float x, float y,float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.getXY();
        this.z = z;
    }
    public float [] getXYZ(){
        return new float[] {super.getX(),super.getY(),this.z};
    }

    public String toString() {
        return super.toString() + "," + this.getZ();
    }
}
