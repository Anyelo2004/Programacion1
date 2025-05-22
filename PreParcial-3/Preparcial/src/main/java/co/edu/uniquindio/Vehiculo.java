package co.edu.uniquindio;


public abstract class Vehiculo implements IPeajeCalculable {

    /**
     * Placa del vehículo.
     */
    protected String placa;

    /**
     * Número de peajes pagados por el vehículo.
     */
    protected int numeroPeajesPagados;

    /**
     * Constructor que inicializa el vehículo con la placa especificada.
     * El número de peajes pagados se inicializa en 0.
     *
     * @param placa Placa del vehículo.
     */
    public Vehiculo(String placa) {
        this.placa = placa;
        this.numeroPeajesPagados = 0;
    }

    /**
     * Establece la placa del vehículo.
     *
     * @param placa Nueva placa del vehículo.
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Retorna la placa del vehículo.
     *
     * @return Placa del vehículo.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Retorna el número de peajes que ha pagado el vehículo.
     *
     * @return Número de peajes pagados.
     */
    public int getNumeroPeajesPagados() {
        return numeroPeajesPagados;
    }

    /**
     * Establece el número de peajes que ha pagado el vehículo.
     *
     * @param numeroPeajesPagados Nuevo número de peajes pagados.
     */
    public void setNumeroPeajesPagados(int numeroPeajesPagados) {
        this.numeroPeajesPagados = numeroPeajesPagados;
    }

    /**
     * Retorna una descripción detallada del vehículo.
     * Este método debe ser implementado por las clases concretas que hereden de Vehiculo.
     *
     * @return Descripción detallada del vehículo.
     */
    public abstract String DescripcionDetallada();

    /**
     * Retorna una representación en cadena del objeto Vehiculo.
     *
     * @return Cadena con la información del vehículo.
     */
    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", numeroPeajesPagados=" + numeroPeajesPagados +
                '}';
    }
}
