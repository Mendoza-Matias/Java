package com.mmendoza.generic_class_example.entities;

public class Triangle extends GeometricFigure {

    // Attributes to store the height and base of the triangle
    private double height;
    private double base;

    // Constructor to initialize the height and base of the triangle
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    // Overridden method to calculate the area of the triangle
    @Override
    public double calculateArea() {
        // Area of a triangle: (base * height) / 2
        return (base * height) / 2;
    }
}
