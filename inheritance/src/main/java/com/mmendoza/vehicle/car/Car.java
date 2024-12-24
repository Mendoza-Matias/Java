package com.mmendoza.vehicle.car;

import com.mmendoza.vehicle.automobile.Automobile;

public class Car extends Automobile {

    /* Attributes */
    private String model;
    private Integer maximumSpeed;

    /* Constructors */
    public Car() {
        super(); // Call the parent class constructor
        this.maximumSpeed = 180;
    }

    public Car(String mark, String tuition, String model) {
        super(mark, tuition); // Call the parameterized constructor of the parent class
        this.model = model;  // Initialize the model attribute
    }

    /* Getters and Setters */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /* Methods */

    @Override
    public void getDetail() {
        super.getDetail(); // Call the method from the parent class
        System.out.println("Model: " + model);
    }

    @Override
    public void hello() {
        System.out.println("Hello Car");
    }

    public void getMaximumSpeed() {
        System.out.println("Maximum speed: " + super.maximumSpeed); // Refer to the parent class value
    }

    public void message() {
        super.message(); // Call the message method from the parent class
    }

    public void adjustSeat() {
        System.out.println("Adjusting the seat");
    }
}
