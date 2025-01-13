package com.mmendoza.generic_class_example.entities;

import java.awt.*; // Importing classes like Rectangle, etc.

public class CalculateArea<T extends GeometricFigure> {

    // Attribute to store a figure of type T that extends GeometricFigure
    private T figure;

    // Constructor that initializes the figure
    public CalculateArea(T figure) {
        this.figure = figure;
    }

    // Method to calculate the area of the figure
    public double calculateArea() {

        // Check if the figure is an instance of Triangle (This seems like a mistake, as the message says "Rectangle")
        if (figure instanceof Triangle) {
            System.out.println("Triangle");
        } else if (figure instanceof Circle) {
            System.out.println("Circle");
        }

        // Call the calculateArea method from the GeometricFigure class
        return figure.calculateArea();
    }
}
