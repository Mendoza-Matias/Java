package org.mmendoza;

public class ExampleAutomobile {
    public static void main(String[] args) {

        /* Initialize the class instance */

        Automobile car1 = new Automobile("Toyoda", "1234");

        Automobile car2 = new Automobile();

        Automobile car3 = new Automobile();

        /* Use the class methods */

        System.out.println(car1.viewDetails());

        System.out.println(car1.accelerateAndBrake(10));

        System.out.println("Kilometers per liter: " + car1.calculateFuelConsumption(300, 0.75f));

        System.out.println("Are they equal? " + car1.equals(car2));
    }
}
