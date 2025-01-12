package com.mmendoza.vehicle.motorbike;

import com.mmendoza.vehicle.automobile.Automobile;

/**
 * Represents a motorbike, which is a type of automobile.
 * If marked as final, this class cannot have child classes.
 */
public class Motorbike extends Automobile {

    /* Attributes */
    private Integer marches; // Represents the number of gears in the motorbike

    /* Constructors */
    // Default constructor: Calls the parent class constructor (Automobile)
    public Motorbike() {
        super();
    }

    // Parameterized constructor: Initializes mark, tuition, and marches (gears)
    public Motorbike(String mark, String tuition, Integer marches) {
        super(mark, tuition); // Call the parent class constructor (Automobile)
        this.marches = marches; // Initialize the marches (gears)
    }

    /* Methods */
    // Override the hello method to print a motorbike-specific message
    @Override
    public void hello() {
        System.out.println("Hello Motorbike");
    }

    /* Getters and Setters */
    // Getter for marches (gears)
    public Integer getMarches() {
        return marches;
    }

    // Setter for marches (gears)
    public void setMarches(Integer marches) {
        this.marches = marches;
    }
}
