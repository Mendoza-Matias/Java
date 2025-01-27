package com.mmendoza;

import com.mmendoza.entities.Car;
import com.mmendoza.entities.Motor;

import java.util.Optional;

/**
 * Demonstrates the use of Optional and conditionals with simple examples.
 */
public class Main {
    public static void main(String[] args) {

        // Example 1: Using Optional with a String

        // Define a name
        String name = "matias";

        // Create an Optional for the name
        Optional<String> optionalName = Optional.ofNullable(name);

        // Check if the Optional contains a value and respond accordingly
        if (optionalName.isPresent()) {
            String hello = "Hello " + optionalName.get(); // Append "Hello" to the name
            System.out.println(hello); // Print the greeting
        } else {
            System.out.println("not found"); // Print "not found" if the name is null
        }

        // Example 2: Using Optional with a Car and Motor

        // Create a Motor instance
        Motor motor = new Motor("ub8");

        // Create a Car instance with the motor
        Car car = new Car("ferrari", motor);

        // Check if the car has a motor and respond accordingly
        if (car.getMotor().isPresent()) {
            System.out.println(car.getMotor().get()); // Print the motor details
        } else {
            System.out.println("not found"); // Print "not found" if the motor is absent
        }
    }
}
