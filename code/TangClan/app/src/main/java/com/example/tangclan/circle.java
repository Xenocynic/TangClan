package com.example.tangclan;

public class Circle extends Shape {
    private double radius;

    // Constructor to initialize x, y, and radius
    public Circle(int x, int y, double radius) {
        this.x = x; 
        this.y = y; 
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}

