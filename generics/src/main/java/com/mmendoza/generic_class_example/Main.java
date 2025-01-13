package com.mmendoza.generic_class_example;

import com.mmendoza.generic_class_example.entities.CalculateArea;
import com.mmendoza.generic_class_example.entities.Triangle;

public class Main {
    public static void main(String[] args) {

        // Create an instance of Triangle with height 10.5 and base 5.5
        Triangle triangleFigure = new Triangle(10.5, 5.5);

        // Create an instance of CalculateArea with the Triangle instance as the figure
        CalculateArea<Triangle> calculateAreaTriangle = new CalculateArea<>(triangleFigure);

        // Print the area of the triangle by calling the calculateArea method
        System.out.println("Area of triangle: " + calculateAreaTriangle.calculateArea()); // Calls method in Triangle to calculate area
    }
}
