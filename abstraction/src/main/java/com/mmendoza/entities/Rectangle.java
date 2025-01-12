package com.mmendoza.entities;

public class Rectangle extends Figure {

    // Implementation of the abstract method to calculate the area of a rectangle
    @Override
    public Double calculateArea(Double base, Double height) {
        // Area of a rectangle is base * height
        return base * height;
    }
}
