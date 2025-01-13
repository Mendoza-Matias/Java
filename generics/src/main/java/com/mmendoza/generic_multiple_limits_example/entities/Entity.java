package com.mmendoza.generic_multiple_limits_example.entities;

import com.mmendoza.generic_two_example.entities.Animal;
import com.mmendoza.generic_multiple_limits_example.interfaces.Jumper;
import com.mmendoza.generic_multiple_limits_example.interfaces.Swimmer;
import com.mmendoza.generic_multiple_limits_example.interfaces.Walker;

// T extends classes that implement the methods

public class Entity<T extends Animal & Walker & Swimmer & Jumper> {

    private T data;

    public Entity(T data) {
        this.data = data;
    }

    public void callMethod() {
        this.data.jump();
        this.data.swim();
        this.data.walk();
    }
}
