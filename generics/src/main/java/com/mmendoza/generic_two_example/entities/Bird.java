package com.mmendoza.generic_two_example.entities;

public class Bird extends Animal implements Flying {
    @Override
    public void fly() {
        System.out.println("Bird flying");
    }
}
