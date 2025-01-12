package com.mmendoza.entities;

/* Encapsulated class - Fields are private and accessed via getters and setters */
public class Person {

    private Integer age;      // Private variable to store the person's age
    private String name;      // Private variable to store the person's name
    private String gender;    // Private variable to store the person's gender

    // Default constructor
    public Person() {
    }

    // Parameterized constructor to initialize the fields with specific values
    public Person(Integer age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    // Getter for age
    public Integer getAge() {
        return age;
    }

    // Setter for age
    public void setAge(Integer age) {
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for gender
    public String getGender() {
        return gender;
    }

    // Setter for gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    /* Additional methods can be added here */
}
