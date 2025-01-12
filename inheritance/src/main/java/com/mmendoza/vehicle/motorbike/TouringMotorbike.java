package com.mmendoza.vehicle.motorbike;

public class TouringMotorbike extends Motorbike {

    private Integer comfortLevel; // Attribute specific to TouringMotorbike, representing comfort level

    /* Getters and Setters */
    // Getter for comfortLevel
    public Integer getComfortLevel() {
        return comfortLevel;
    }

    // Setter for comfortLevel
    public void setComfortLevel(Integer comfortLevel) {
        this.comfortLevel = comfortLevel;
    }
}
