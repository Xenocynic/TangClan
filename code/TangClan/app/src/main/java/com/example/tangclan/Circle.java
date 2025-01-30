package com.example.tangclan;

public class Circle extends Shape {
    private double radius; // Radius of the circle

    // Constructor to initialize x, y, and radius
    public Circle(int x, int y, double radius) {
        this.x = x;  // Inherited from Shape
        this.y = y;  // Inherited from Shape
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }