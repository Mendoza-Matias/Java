package com.mmendoza.generic_multiple_limits_example.entities;

import com.mmendoza.generic_two_example.entities.Animal;
import com.mmendoza.generic_multiple_limits_example.interfaces.Jumper;
import com.mmendoza.generic_multiple_limits_example.interfaces.Swimmer;
import com.mmendoza.generic_multiple_limits_example.interfaces.Walker;

public class Frog extends Animal implements Walker, Jumper, Swimmer {

    @Override
    public void jump() {
        System.out.println("Frog jump");
    }

    @Override
    public void swim() {
        System.out.println("Frog swim");
    }

    @Override
    public void walk() {
        System.out.println("Frog walk");
    }
}
