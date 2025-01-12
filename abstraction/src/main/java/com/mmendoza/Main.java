package com.mmendoza;

import com.mmendoza.entities.Rectangle;
import com.mmendoza.entities.Triangle;

public class Main {
    public static void main(String[] args) {

        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle();

        // Create an instance of Triangle
        Triangle triangle = new Triangle();

        // Calculate and print the area of the rectangle
        System.out.println("Area of rectangle: " + rectangle.calculateArea(10.0, 5.0));

        // Calculate and print the area of the triangle
        System.out.println("Area of triangle: " + triangle.calculateArea(10.0, 5.0));
    }
}
