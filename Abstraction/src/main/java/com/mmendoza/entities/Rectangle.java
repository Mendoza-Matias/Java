package com.mmendoza.entities;

public class Rectangle extends Figure {
    @Override
    public Double calculateArea(Double base, Double height) {
        return base * height;
    }
}
