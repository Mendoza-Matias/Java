package com.mmendoza;

import com.mmendoza.entities.Rectangle;
import com.mmendoza.entities.Triangle;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        Triangle triangle = new Triangle();

        System.out.println("Area rectangle: " + rectangle.calculateArea(10.0, 5.0));

        System.out.println("Area triangle: " + triangle.calculateArea(10.0, 5.0));

    }
}
