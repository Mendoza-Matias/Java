package com.mmendoza.vehicle.automobile;

public class Automobile {

    /* Constants */
    private static final String NAME;  // Constant for the name of the automobile
    private static final Integer CODE = 123; // Constant code initialized directly

    // Static block for initializing NAME constant
    static {
        NAME = "Automobile"; // Assigning value to the NAME constant
    }

    /* Attributes */
    private String mark;         // The mark/brand of the automobile
    private String tuition;      // Tuition (or license plate number)
    public Integer maximumSpeed; // Public attribute for maximum speed (not recommended to be public)

    /* Constructors */
    // Default constructor to initialize maximum speed
    public Automobile() {
        this.maximumSpeed = 120; // Default maximum speed
    }

    // Parameterized constructor to initialize mark and tuition
    public Automobile(String mark, String tuition) {
        this.mark = mark;
        this.tuition = tuition;
    }

    /* Getters and Setters */
    // Getter and setter for mark
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    // Getter and setter for tuition
    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    // Getter for CODE constant
    public Integer getCODE() {
        return CODE;
    }

    /* Methods */
    // Method to display the maximum speed of the automobile
    public void getMaximumSpeed() {
        System.out.println("Maximum speed: " + maximumSpeed);
    }

    // Method to display the details of the automobile
    public void getDetail() {
        System.out.println("Details: " + mark + " " + tuition);
    }

    // Method to display a general message
    public void message() {
        System.out.println("Hello Automobile");
    }

    // Another method to print a greeting message
    public void hello() {
        System.out.println("Hello Automobile");
    }

    // Method to simulate acceleration
    public void accelerate() {
        System.out.println("Automobile accelerating");
    }

    // Method to simulate braking
    public void brake() {
        System.out.println("Automobile braking");
    }

    // Final method that cannot be overridden in subclasses
    public final void example() {
        System.out.println("Automobile example");
    }
}
