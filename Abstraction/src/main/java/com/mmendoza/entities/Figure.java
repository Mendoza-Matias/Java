package com.mmendoza.entities;

public abstract class Figure {

    private Double base;
    private Double height;
    private String name;

    public abstract Double calculateArea(Double base, Double height); /* method abstract */
}
