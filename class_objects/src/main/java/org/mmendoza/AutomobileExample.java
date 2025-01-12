package org.mmendoza;

import org.mmendoza.entities.Automobile;

public class AutomobileExample {
    public static void main(String[] args) {


        /* Initialize the class instances */

        // Create an instance of Automobile with manufacturer and model
        Automobile car1 = new Automobile("Toyoda", "1234");

        // Create an instance of Automobile using the default constructor
        Automobile car2 = new Automobile();

        // Create another instance of Automobile using the default constructor
        Automobile car3 = new Automobile();

        /* Use the class methods */

        // Print the details of car1
        System.out.println(car1.viewDetails());

        // Simulate acceleration and braking for car1
        System.out.println(car1.accelerateAndBrake(10));

        // Calculate and display the fuel consumption for car1
        System.out.println("Kilometers per liter: " + car1.calculateFuelConsumption(300, 0.75f));

        // Compare if car1 and car2 are equal based on manufacturer
        System.out.println("Are they equal? " + car1.equals(car2));
    }
}
