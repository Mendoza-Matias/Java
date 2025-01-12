package com.mmendoza.entities;

public abstract class Figure {

    private Double base;
    private Double height;
    private String name;

    // Abstract method to calculate the area, should be implemented by subclasses
    public abstract Double calculateArea(Double base, Double height);
}
