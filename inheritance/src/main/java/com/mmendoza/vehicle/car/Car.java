package com.mmendoza.vehicle.car;

import com.mmendoza.vehicle.automobile.Automobile;

public class Car extends Automobile {

    /* Attributes */
    private String model;        // The model of the car
    private Integer maximumSpeed; // Maximum speed of the car (overriding the parent attribute)

    /* Constructors */
    // Default constructor: Calls the parent class constructor and sets maximum speed
    public Car() {
        super(); // Call the parent class constructor (Automobile)
        this.maximumSpeed = 180; // Set the maximum speed for the car
    }

    // Parameterized constructor: Initializes mark, tuition, and model
    public Car(String mark, String tuition, String model) {
        super(mark, tuition); // Call the parameterized constructor of the parent class (Automobile)
        this.model = model;    // Initialize the model attribute
    }

    /* Getters and Setters */
    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    /* Methods */

    // Override the getDetail method to include model details
    @Override
    public void getDetail() {
        super.getDetail(); // Call the getDetail method from the parent class (Automobile)
        System.out.println("Model: " + model); // Print the model specific to the Car class
    }

    // Override the hello method to print a car-specific greeting
    @Override
    public void hello() {
        System.out.println("Hello Car");
    }

    // Override getMaximumSpeed to use the Car's maximum speed
    public void getMaximumSpeed() {
        System.out.println("Maximum speed: " + super.maximumSpeed); // Refer to the parent class maximumSpeed
    }

    // Override message method to call the parent class message method
    public void message() {
        super.message(); // Call the message method from the parent class (Automobile)
    }

    // Additional method specific to the Car class
    public void adjustSeat() {
        System.out.println("Adjusting the seat");
    }
}
