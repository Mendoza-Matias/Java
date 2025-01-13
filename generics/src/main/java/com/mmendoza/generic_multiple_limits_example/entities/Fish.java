package com.mmendoza.generic_multiple_limits_example.entities;

import com.mmendoza.generic_multiple_limits_example.interfaces.Swimmer;

public class Fish implements Swimmer {

    @Override
    public void swim() {
        System.out.println("Swimming Fish");
    }

}
