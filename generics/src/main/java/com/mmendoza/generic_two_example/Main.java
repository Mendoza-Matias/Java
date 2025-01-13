package com.mmendoza.generic_two_example;

import com.mmendoza.generic_two_example.entities.Animal;
import com.mmendoza.generic_two_example.entities.Bird;
import com.mmendoza.generic_two_example.entities.Box;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();

        Animal animal = new Animal();

        Box<Bird> birdBox =  new Box<>(bird); /* create box of birds */

        //Box<Animal> animalBox = new Box<Animal>(animal); this case is not valid because it does not implement the flying interface

        birdBox.callMethod(); /* call the method eat because it extends animal and implements flying */
    }
}
