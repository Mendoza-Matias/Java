package com.mmendoza.entities;

public class Triangle extends Figure {

    /* implements method abstract */
    @Override
    public Double calculateArea(Double base, Double height) {
        return base * height / 2;
    }
}
