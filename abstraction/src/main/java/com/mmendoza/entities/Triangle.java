package com.mmendoza.entities;

public class Triangle extends Figure {

    // Implementation of the abstract method to calculate the area of a triangle
    @Override
    public Double calculateArea(Double base, Double height) {
        // Area of a triangle is (base * height) / 2
        return base * height / 2;
    }
}
