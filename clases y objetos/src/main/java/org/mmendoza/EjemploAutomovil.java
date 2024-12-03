package org.mmendoza;

public class EjemploAutomovil {
    public static void main(String[] args) {

        /* Inicializo la instancia de la clase */

        Automovil auto = new Automovil("Toyoda", "1234");

        Automovil autoDos = new Automovil();

        Automovil autoTres = new Automovil();

        /* Utilizo el metodo de la clase */

        System.out.println(auto.verDetalle());

        System.out.println(auto.acelerarFrenar(10));

        System.out.println("Kilometros por litro " + auto.calcularConsumo(300, 0.75f));

        System.out.println("Son iguales " + auto.equals(autoDos));
    }
}
