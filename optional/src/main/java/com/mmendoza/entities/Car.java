package com.mmendoza.entities;

import java.util.Optional;

/**
 * Represents a Car with a specific mark (brand) and an optional motor.
 */
public class Car {

    // The brand of the car
    private String mark;

    // An optional motor associated with the car
    private Optional<Motor> motor;

    /**
     * Constructor to initialize the Car with a brand and an optional motor.
     *
     */
    public Car(String mark, Motor motor) {
        this.mark = mark;
        this.motor = Optional.ofNullable(motor);
    }

    /**
     * Retrieves the brand of the car.
     *
     */
    public String getMark() {
        return mark;
    }

    /**
     * Retrieves the optional motor of the car.
     *
     */
    public Optional<Motor> getMotor() {
        return motor;
    }
}
