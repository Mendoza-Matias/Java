package org.mmendoza;

public class Automovil {

    /* Atributos */
    private String fabricante; // Modificador de acceso privado, visibles solo dentro de la clase
    private String modelo;
    private Color color; // Uso del enum como un tipo de dato
    private double cilindrada;
    private int capacidadTanque = 40; // Valor predeterminado
    private static String colorPatente = "Naranja";
    // Static -> Pertenece a la clase, se comparte entre todas las instancias.

    /* Constantes de la clase */
    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final String COLOR_ROJO = "rojo";
    public static final String COLOR_AMARILLO = "amarillo";

    /* Constructores */
    public Automovil() {
        // Constructor sin parámetros
    }

    // Para inicializar objetos con valores
    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    // Sobrecarga de constructores
    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo); // Llama al otro constructor
        this.color = color;
    }

    /* Métodos */
    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String verDetalle() {
        // Devuelve una descripción detallada del automóvil
        return "Fabricante: " + this.fabricante +
                "\nCilindrada: " + this.cilindrada +
                "\nColor de patente: " + colorPatente;
    }

    /* Métodos estáticos */
    public static String getColorPatente() {
        return Automovil.colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " está acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " está frenando";
    }

    public String acelerarFrenar(int rpm) {
        return this.acelerar(rpm) + "\n" + this.frenar();
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (this.capacidadTanque * porcentajeBencina);
    }

    /* Sobreescritura del método equals */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Verifica si son el mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false; // Verifica la clase

        Automovil a = (Automovil) obj; // Cast seguro
        return this.fabricante != null && this.fabricante.equals(a.fabricante);
    }
}
