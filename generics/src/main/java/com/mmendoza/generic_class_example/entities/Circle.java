package com.mmendoza.generic_class_example.entities;

public class Circle extends GeometricFigure {

    // Attribute to store the radius of the circle
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overridden method to calculate the area of the circle
    @Override
    public double calculateArea() {
        // Area of a circle: π * radius^2
        return Math.PI * radius * radius;
    }
}
