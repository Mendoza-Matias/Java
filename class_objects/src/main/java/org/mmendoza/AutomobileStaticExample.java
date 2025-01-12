package org.mmendoza;

import org.mmendoza.entities.Automobile;
import org.mmendoza.entities.enums.Color;

public class AutomobileStaticExample {
    public static void main(String[] args) {

        /* Initialize the class instances with specific attributes */

        // Create an instance of Automobile with manufacturer, model, and color
        Automobile car1 = new Automobile("Toyoda", "1234", Color.BLUE);

        // Create an instance of Automobile with manufacturer, model, and color
        Automobile car2 = new Automobile("Ford", "3456", Color.RED);

        // Create an instance of Automobile with manufacturer, model, and color
        Automobile car3 = new Automobile("Renaut", "7891", Color.YELLOW);

        // Print the details of each car using the viewDetails method
        System.out.println(car1.viewDetails());
        System.out.println(car2.viewDetails());
        System.out.println(car3.viewDetails());

        /* Using the class name to access static methods
         * The change will apply to all instances of the class */

        // Print the license plate color using the static getter method
        System.out.println(Automobile.getLicensePlateColor());

        // Print the color associated with the enum RED from the Color enum
        System.out.println(Color.RED.getColor());
    }
}
