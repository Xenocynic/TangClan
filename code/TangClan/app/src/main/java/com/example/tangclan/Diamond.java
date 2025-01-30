package com.example.tangclan;

public class Diamond extends Shape {
    private double area;

    // Constructor to initialize x, y, and area
    public Diamond(int x, int y, double area) {
        this.x = x;
        this.y = y;
        this.area = area;
    }
    public double getArea() {
        return area;
    }

    public void setArea(double Area) {
        this.area = area;
    }

}