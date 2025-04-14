package co.edu.uniquindio;

/**
 * Representa un vehículo destinado al transporte de tropas.
 * Extiende la clase {@link Vehiculo} y añade un atributo específico para la capacidad de soldados.
 */
public class VehiculoTransporteTropa extends Vehiculo {

    /**
     * Número máximo de soldados que el vehículo puede transportar.
     */
    private int capacidadSoldados;

    /**
     * Crea una nueva instancia de VehiculoTransporteTropa con los datos especificados.
     *
     * @param id                 Identificador único del vehículo.
     * @param modelo             Modelo del vehículo.
     * @param anioFabricacion    Año de fabricación del vehículo.
     * @param kilometraje        Kilometraje actual del vehículo.
     * @param estadoOperativo    Estado operativo actual del vehículo.
     * @param capacidadSoldados  Capacidad máxima de soldados que puede transportar.
     */
    public VehiculoTransporteTropa(String id, String modelo, int anioFabricacion, double kilometraje,
                                   EstadoOperativo estadoOperativo, int capacidadSoldados) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo);
        this.capacidadSoldados = capacidadSoldados;
    }

    /**
     * Obtiene la capacidad de soldados que puede transportar el vehículo.
     *
     * @return Capacidad máxima de soldados.
     */
    public int getCapacidadSoldados() {
        return capacidadSoldados;
    }

    /**
     * Establece la capacidad de soldados que puede transportar el vehículo.
     *
     * @param capacidadSoldados Nueva capacidad máxima de soldados.
     */
    public void setCapacidadSoldados(int capacidadSoldados) {
        this.capacidadSoldados = capacidadSoldados;
    }
}
