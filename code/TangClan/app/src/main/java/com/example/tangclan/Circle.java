package com.example.tangclan;

public class Circle extends Shape {
    private double radius;

    // Constructor to initialize x, y, and radius
    public Circle(int x, int y, double radius) {
        this.x = x;  // Directly setting x from Shape class
        this.y = y;  // Directly setting y from Shape class
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}