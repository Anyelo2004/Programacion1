package co.edu.uniquindio;

public class Camion extends Vehiculo {

    /** Número de ejes del camión. */
    private int numEjes;

    /** Capacidad de carga del camión en toneladas. */
    private double capacidadToneladas;

    /**
     * Crea una nueva instancia de {@code Camion} con los datos especificados.
     *
     * @param placa La placa del camión.
     * @param numeroEjes El número de ejes del camión.
     * @param capacidadToneladas La capacidad de carga del camión en toneladas.
     */
    public Camion(String placa, int numeroEjes, double capacidadToneladas) {
        super(placa);
        this.numEjes = numeroEjes;
        this.capacidadToneladas = capacidadToneladas;
    }

    /**
     * Obtiene la capacidad de carga del camión en toneladas.
     *
     * @return Capacidad en toneladas.
     */
    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    /**
     * Establece la capacidad de carga del camión en toneladas.
     *
     * @param capacidadToneladas Nueva capacidad en toneladas.
     */
    public void setCapacidadToneladas(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }

    /**
     * Obtiene el número de ejes del camión.
     *
     * @return Número de ejes.
     */
    public int getNumEjes() {
        return numEjes;
    }

    /**
     * Establece el número de ejes del camión.
     *
     * @param numEjes Nuevo número de ejes.
     */
    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    /**
     * Devuelve una representación en forma de cadena del camión.
     *
     * @return Cadena que representa el camión.
     */
    @Override
    public String toString() {
        return "Camion{" +
                "numeroEjes=" + numEjes +
                ", capacidadToneladas=" + capacidadToneladas +
                ", placa='" + placa + '\'' +
                ", numeroPeajesPagados=" + numeroPeajesPagados +
                '}';
    }

    /**
     * Calcula el valor del peaje que debe pagar el camión.
     * El valor base es de 7000 por eje, con un 10% adicional si la capacidad es mayor a 10 toneladas.
     *
     * @return Valor del peaje calculado.
     */
    @Override
    public double calcularPeaje() {
        double valor = 7000 * numEjes;
        if (capacidadToneladas > 10) {
            valor += valor * 0.10;
        }
        return valor;
    }

    /**
     * Devuelve una descripción detallada del camión.
     *
     * @return Descripción completa del camión.
     */
    @Override
    public String DescripcionDetallada() {
        return "Camion{" +
                "placa='" + placa + '\'' +
                ", numeroPeajesPagados=" + numeroPeajesPagados +
                ", numeroEjes=" + numEjes +
                ", capacidadToneladas=" + capacidadToneladas +
                '}';
    }
}
