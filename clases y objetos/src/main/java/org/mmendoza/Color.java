package org.mmendoza;

public enum Color {
    /* valores constantes */
    ROJO("Rojo"),
    AMARILLO("Amarillo"), /* Valores a la constante */
    AZUL("Azul");
    private final String color; /* Atributo final */

    Color(String color) { /* Le asigno un valor desde el constructor */
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
