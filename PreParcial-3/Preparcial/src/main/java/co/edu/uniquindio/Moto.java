package co.edu.uniquindio;


public class Moto extends Vehiculo {

    /**
     * Cilindraje de la moto en centímetros cúbicos (cc).
     */
    private int cilindraje;

    /**
     * Constructor que inicializa una moto con su placa y cilindraje.
     *
     * @param placa      Placa del vehículo.
     * @param cilindraje Cilindraje de la moto.
     */
    public Moto(String placa, int cilindraje) {
        super(placa);
        this.cilindraje = cilindraje;
    }

    /**
     * Obtiene el cilindraje de la moto.
     *
     * @return Cilindraje de la moto.
     */
    public int getCilindraje() {
        return cilindraje;
    }

    /**
     * Establece el cilindraje de la moto.
     *
     * @param cilindraje Nuevo valor del cilindraje.
     */
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    /**
     * Calcula el valor del peaje que debe pagar la moto.
     * El valor base es 5000, y si el cilindraje es mayor a 200,
     * se agrega un recargo de 2000.
     *
     * @return Valor del peaje.
     */
    @Override
    public double calcularPeaje() {
        double valor = 5000;
        if (getCilindraje() > 200) {
            valor = valor + 2000;
        }
        return valor;
    }

    /**
     * Retorna una descripción detallada de la moto.
     *
     * @return Cadena con la información detallada de la moto.
     */
    @Override
    public String DescripcionDetallada() {
        return "Moto{" +
                "cilindraje=" + cilindraje +
                ", placa=" + placa +
                ", numeroPeajesPagados=" + numeroPeajesPagados +
                '}';
    }
}
