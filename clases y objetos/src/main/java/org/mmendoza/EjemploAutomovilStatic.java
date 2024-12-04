package org.mmendoza;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        /* Inicializo la instancia de la clase */

        Automovil auto = new Automovil("Toyoda", "1234");

        Automovil auto2 = new Automovil("Ford", "3456");

        Automovil auto3 = new Automovil("Renaut", "7891");

        System.out.println(auto.verDetalle());
        System.out.println(auto2.verDetalle());
        System.out.println(auto3.verDetalle());

        /* Por medio el nombre de la clase
         * Se cambia para todos*/
        System.out.println(Automovil.getColorPatente());
    }
}
