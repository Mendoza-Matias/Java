package com.mmendoza;

import com.mmendoza.entities.Car;
import com.mmendoza.entities.Motor;

import java.util.Optional;

/**
 * Demonstrates the use of Optional and lambda expressions with a Car and Motor example.
 */
public class FunctionalExample {
    public static void main(String[] args) {

        // Create a Motor instance with type "ub8"
        Motor motor = new Motor("ub8");

        // Create a Car instance with a brand and the created motor
        Car car = new Car("ferrari", motor);

        // Use a lambda expression to print car and motor details if the motor is present
        car.getMotor().ifPresent(m -> {
            System.out.println(car.getMark()); // Print the car brand
            System.out.println(m.getType()); // Print the motor type
        });

        // Create an Optional that may contain a value or be empty
        Optional<String> valueOptional = Optional.ofNullable(getData());

        // If valueOptional is not null, return its value; otherwise, use an alternative value
        String result = valueOptional.orElseGet(() -> getValueAlternative());

        // Print the result
        System.out.println(result);
    }

    /**
     * Simulates a function that returns a value, which may be null.
     */
    public static String getData() {
        return null;
    }

    /**
     * Provides an alternative value if the primary value is null.
     */
    public static String getValueAlternative() {
        return "value alternative";
    }
}
