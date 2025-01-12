package com.mmendoza.vehicle.motorbike;

public class SportMotorbike extends Motorbike {

    private Integer velocity; // Attribute specific to SportMotorbike, representing velocity

    /* Getters and Setters */
    // Getter for velocity
    public Integer getVelocity() {
        return velocity;
    }

    // Setter for velocity
    public void setVelocity(Integer velocity) {
        this.velocity = velocity;
    }
}
