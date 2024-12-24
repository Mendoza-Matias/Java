package com.mmendoza.vehicle.motorbike;

import com.mmendoza.vehicle.automobile.Automobile;

/**
 * Represents a motorbike, which is a type of automobile.
 * If marked as final, this class cannot have child classes.
 */
public class Motorbike extends Automobile {

    /* Attributes */
    private Integer marches;

    /* Constructors */
    public Motorbike() {
        super();
    }

    public Motorbike(String mark, String tuition, Integer marches) {
        super(mark, tuition);
        this.marches = marches;
    }

    /* Methods */
    @Override
    public void hello() {
        System.out.println("Hello Motorbike");
    }

    /* Getters and Setters */
    public Integer getMarches() {
        return marches;
    }

    public void setMarches(Integer marches) {
        this.marches = marches;
    }
}
