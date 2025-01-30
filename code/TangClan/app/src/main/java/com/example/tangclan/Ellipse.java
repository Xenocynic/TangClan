package com.example.tangclan;

public class Ellipse extends Shape{
    private double a; // length of semi-major axis
    private double b; // length of semi-minor axis

    public Ellipse(int x, int y, double a, double b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
