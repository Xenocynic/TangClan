package com.example.tangclan;

public class Rectangle extends Shape {
    private int area;

    // Constructor to initialize dimensions
    public Rectangle(int width, int height) {
        this.x = width; // width
        this.y = height; // height
        this.area = width * height;
    }

    @Override
    public void setX(int x) {
        this.x = x;
        this.area = x * this.y;  // update area with new width
    }
    @Override
    public void setY(int y) {
        this.y = y;
        this.area = this.x * y;  // update area with new height
    }

    // Getter for area
    public int getArea() {
        return area;
    }
}
