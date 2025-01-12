package com.mmendoza;

import com.mmendoza.entities.Person;

public class Main {
    public static void main(String[] args) {

        // Create a new Person object using the parameterized constructor
        Person person1 = new Person(25, "John Doe", "Male");

        // Accessing the person's details using getter methods (encapsulation)
        System.out.println("Person 1 Details:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());

        // Modify the person's age using the setter method
        person1.setAge(26);
        System.out.println("\nUpdated Age for Person 1: " + person1.getAge());

        // Create another Person object using the default constructor and setters
        Person person2 = new Person();
        person2.setAge(30);
        person2.setName("Jane Smith");
        person2.setGender("Female");

        // Accessing the details of the second person
        System.out.println("\nPerson 2 Details:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Gender: " + person2.getGender());
    }
}
