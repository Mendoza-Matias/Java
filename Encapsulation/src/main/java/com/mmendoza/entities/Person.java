package com.mmendoza.entities;

/* encapsulated */
public class Person {
    private Integer age; /* private variables */
    private String name;
    private String gender;

    public Person() {

    }

    public Person(Integer age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /* methods */
}
