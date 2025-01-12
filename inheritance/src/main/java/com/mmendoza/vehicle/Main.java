package com.mmendoza.vehicle;

import com.mmendoza.vehicle.automobile.Automobile;
import com.mmendoza.vehicle.car.Car;
import com.mmendoza.vehicle.car.touring.AllTerrainCar;
import com.mmendoza.vehicle.motorbike.Motorbike;

public class Main {
    public static void main(String[] args) {
        // Creating objects
        System.out.println("Creating an Automobile...");
        Automobile automobile = new Automobile();
        automobile.setMark("Ford");
        automobile.setTuition("GKM286");

        // Methods of the class
        System.out.println("Automobile:");
        System.out.println("Mark: " + automobile.getMark());
        System.out.println("Tuition: " + automobile.getTuition());
        automobile.accelerate(); // Calling the accelerate method from Automobile
        automobile.brake();      // Calling the brake method from Automobile

        System.out.println("---------------------------");

        // Example: Car (Child of Automobile)
        System.out.println("Creating a Car...");
        Car car = new Car();
        car.setMark("Ford");
        car.setTuition("GKM286");
        car.setModel("EcoSport");

        System.out.println("Car:");
        System.out.println("Mark: " + car.getMark());
        System.out.println("Tuition: " + car.getTuition());
        System.out.println("Model: " + car.getModel());
        car.accelerate(); // Calling the accelerate method from Car (inherited from Automobile)
        car.brake();      // Calling the brake method from Car (inherited from Automobile)
        car.adjustSeat(); // Calling the adjustSeat method from Car

        System.out.println("---------------------------");

        // Example: AllTerrainCar (Grandchild of Automobile)
        System.out.println("Creating an AllTerrainCar...");
        AllTerrainCar allTerrainCar = new AllTerrainCar();
        allTerrainCar.setMark("Ford");
        allTerrainCar.use4x4();  // Calling the use4x4 method from AllTerrainCar
        allTerrainCar.accelerate(); // Calling the accelerate method from AllTerrainCar (inherited)
        allTerrainCar.brake();      // Calling the brake method from AllTerrainCar (inherited)
        allTerrainCar.setComfortLevel(5); // Setting comfort level for AllTerrainCar
        allTerrainCar.adjustSeat(); // Calling the adjustSeat method from Car (inherited)

        System.out.println("AllTerrainCar:");
        System.out.println("Comfort level: " + allTerrainCar.getComfortLevel());

        System.out.println("---------------------------");

        // Accessing final variable CODE from Automobile class
        System.out.println("Accessing CODE:");
        System.out.println("CODE: " + automobile.getCODE());

        System.out.println("--------------------------------------");

        // Example of polymorphism and method overriding
        System.out.println("Polymorphism examples:");
        Automobile automobile1 = new Automobile();
        Car car1 = new Car();

        automobile1.getMaximumSpeed(); // Calls the getMaximumSpeed method from Automobile (returns 120)
        car1.getMaximumSpeed();        // Calls the getMaximumSpeed method from Car (still 120, inherited)

        automobile1.message();         // Returns "Hello Automobile" from Automobile
        car1.message();                // Returns "Hello Automobile" from Car (via super)

        System.out.println("-------------------------------------");

        // Example of constructors
        System.out.println("Example constructors:");
        Car car2 = new Car("Renaut", "HGH909", "2002");
        System.out.println("Car2:");
        System.out.println("Mark: " + car2.getMark());
        System.out.println("Tuition: " + car2.getTuition());
        System.out.println("Model: " + car2.getModel());

        System.out.println("-------------------------------------");

        // Example of method overriding
        System.out.println("Method overriding examples:");
        Automobile automobile2 = new Automobile("Audi", "MGM123");
        automobile2.getDetail(); // Calls overridden getDetail method from Automobile

        Car car3 = new Car("Ford", "DDE324", "2013");
        car3.getDetail(); // Calls overridden getDetail method from Car

        System.out.println("-------------------------------------");

        // Polymorphism examples with different objects
        System.out.println("Polymorphism example with different objects:");
        Automobile automobile3 = new Automobile();
        Car car4 = new Car();
        Motorbike motorbike = new Motorbike();

        Automobile x;

        x = automobile3;
        x.hello(); // Prints "Hello Automobile" (from Automobile)

        x = car4;
        x.hello(); // Prints "Hello Car" (from Car)

        x = motorbike;
        x.hello(); // Prints "Hello Motorbike" (from Motorbike)
    }
}
