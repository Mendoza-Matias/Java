package org.mmendoza;

public class EjemploEnumIterar {
    public static void main(String[] args) {

        TipoAutomovil[] tipoAutomovils = TipoAutomovil.values();

        for (TipoAutomovil t : tipoAutomovils) {
            System.out.print(t.getNombre());
            System.out.println();
        }


    }
}
