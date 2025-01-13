package com.mmendoza.generic_multiple_limits_example;

import com.mmendoza.generic_multiple_limits_example.entities.Entity;
import com.mmendoza.generic_multiple_limits_example.entities.Fish;
import com.mmendoza.generic_multiple_limits_example.entities.Frog;
import com.mmendoza.generic_multiple_limits_example.entities.Person;

public class Main {
    public static void main(String[] args) {

        // Create instances of different entity types
        Frog frog = new Frog();
        Person person = new Person();
        Fish fish = new Fish();

        // Create Entity objects specifying the type (Frog in this case)
        Entity<Frog> entity = new Entity<>(frog);

        // Create another Entity object for the Person type
        // Entity<Person> entity1 = new Entity<>(person);

        // Uncommenting this line will cause a compilation error
        // because Entity<Fish> expects a Fish object
        // Entity<Fish> entity2 = new Entity<Fish>(fish);

        // Call the method from the Entity class that is specific to the type
        entity.callMethod();  // Calls method on Entity<Frog>
        //entity1.callMethod(); // Calls method on Entity<Person>
    }
}
