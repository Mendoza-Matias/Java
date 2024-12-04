package org.mmendoza;

public class Automovil {

    /* Atributos */

    private String fabricante;
    /* Modificador de acceso privado -> visibles dentro de la clase*/
    private String modelo;

    private String color;
    private double cilindrada;
    private int capacidadTanque = 40; /* Valor default */
    private static String colorPatente = "Naranja";
    /* Le pertenece a la clase , se comparte entre todas las instancias y si es modificado , en todas se vera reflejado */

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    /* Constante de la clase */

    /* Constructor */
    public Automovil() {
        /* Constructor sin parametros */
    }

    /* Para inicializar objetos con valores */
    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    /* Sobrecarga de constructores */
    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo); /* Llamo al otro constructor */
        this.color = color;
    }

    /* Metodos */
    public String getFabricante() {
        return this.fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    /* Setter */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String verDetalle() {
        /* Modificador de acceso -> Retorno -> Nombre (Parametros){Cuerpo}*/

        return "auto.fabricante " + this.fabricante +
                "\nauto.cilindrada " + this.cilindrada +
                "\ncolor patente " + colorPatente;

        /* this -> referencia el valor de un atributo de la clase */
    }

    /* Metodos estaticos */
    public static String getColorPatente() {
        return Automovil.colorPatente;
    }

    /* Solo se pueden utilizar atributos estaticos dentro de un metodo estatico */
    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public String acelerar(int rmp) {
        return "El auto " + this.fabricante + " acelerando a " + rmp + "rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando ";
    }

    public String acelerarFrenar(int rmp) {
        return this.acelerar(rmp) + "\n"
                + this.frenar();
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (this.capacidadTanque * porcentajeBencina);
    }

    /* Sobreescribir metodo */
    @Override
    public boolean equals(Object obj) {
        Automovil a = (Automovil) obj; /* Cast */

        return this.fabricante != null &&
                this.fabricante.equals(a.fabricante);

        /* Comparo el objeto actual con otro que llega como
         * parametro */
    }
}
