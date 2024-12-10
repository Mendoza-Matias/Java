package org.mmendoza;

public class ExampleAutomobileStatic {
    public static void main(String[] args) {

        /* Initialize the class instance */

        Automobile car1 = new Automobile("Toyoda", "1234", Color.BLUE);

        Automobile car2 = new Automobile("Ford", "3456", Color.RED);

        Automobile car3 = new Automobile("Renaut", "7891", Color.YELLOW);

        System.out.println(car1.viewDetails());
        System.out.println(car2.viewDetails());
        System.out.println(car3.viewDetails());

        /* Using the class name
         * The change applies to all */
        System.out.println(Automobile.getLicensePlateColor());
        System.out.println(Color.RED.getColor());
    }
}
