package com.mmendoza.generic_multiple_limits_example.entities;

import com.mmendoza.generic_multiple_limits_example.interfaces.Jumper;
import com.mmendoza.generic_multiple_limits_example.interfaces.Swimmer;
import com.mmendoza.generic_multiple_limits_example.interfaces.Walker;

// implements all interfaces
public class Person implements Walker, Jumper, Swimmer {

    @Override
    public void jump() {
        System.out.println("Person jump");
    }

    @Override
    public void swim() {
        System.out.println("Person swim");
    }

    @Override
    public void walk() {
        System.out.println("Person walk");
    }
}
