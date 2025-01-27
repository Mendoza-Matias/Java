package com.mmendoza.entities;

/**
 * Represents a Motor with a specific type.
 */
public class Motor {

    // The type of the motor
    private String type;

    /**
     * Constructor to initialize the Motor with a specific type.
     */
    public Motor(String type) {
        this.type = type;
    }

    /**
     * Retrieves the type of the motor.
     */
    public String getType() {
        return type;
    }
}