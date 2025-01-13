package com.mmendoza.generic_constructor_example.entities;

public class MyClass<T> {

    // Generic attribute to hold a value of type T
    private T value;

    // Generic constructor that accepts a value of type T and assigns it to the value attribute
    public MyClass(T value) {
        this.value = value;
    }

    // Getter method to retrieve the value of type T
    public T getValue() {
        return value;
    }

    // Setter method to set the value of type T
    public void setValue(T value) {
        this.value = value;
    }
}
