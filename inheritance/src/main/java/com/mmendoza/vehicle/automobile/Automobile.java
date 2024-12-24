package com.mmendoza.vehicle.automobile;

public class Automobile {

    /* Constants */
    private static final String NAME;
    private static final Integer CODE = 123; // Initialized directly.

    static {
        NAME = "Automobile";
    }

    /* Attributes */
    private String mark;
    private String tuition;
    public Integer maximumSpeed; // Public attribute for example purposes (not recommended).

    /* Constructors */
    public Automobile() {
        this.maximumSpeed = 120;
    }

    public Automobile(String mark, String tuition) {
        this.mark = mark;
        this.tuition = tuition;
    }

    /* Getters and Setters */
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    public Integer getCODE() {
        return CODE;
    }

    /* Methods */
    public void getMaximumSpeed() {
        System.out.println("Maximum speed: " + maximumSpeed);
    }

    public void getDetail() {
        System.out.println("Details: " + mark + " " + tuition);
    }

    public void message() {
        System.out.println("Hello Automobile");
    }

    public void hello() {
        System.out.println("Hello Automobile");
    }

    public void accelerate() {
        System.out.println("Automobile accelerate");
    }

    public void brake() {
        System.out.println("Automobile brake");
    }

    public final void example() {
        System.out.println("Automobile example");
    }
}
