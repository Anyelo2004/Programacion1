package co.edu.uniquindio;

/**
 * Representa un vehículo blindado con un nivel específico de blindaje.
 * Extiende la clase {@link Vehiculo} y añade el atributo de nivel de blindaje.
 */
public class VehiculoBlindado extends Vehiculo {

    /**
     * Nivel de blindaje del vehículo (mayor valor indica mayor protección).
     */
    private int nivelBlindaje;

    /**
     * Crea una nueva instancia de VehiculoBlindado con los datos especificados.
     *
     * @param id               Identificador único del vehículo.
     * @param modelo           Modelo del vehículo.
     * @param anioFabricacion  Año de fabricación del vehículo.
     * @param kilometraje      Kilometraje actual del vehículo.
     * @param estadoOperativo  Estado operativo actual del vehículo.
     * @param nivelBlindaje    Nivel de blindaje del vehículo.
     */
    public VehiculoBlindado(String id, String modelo, int anioFabricacion, double kilometraje,
                            EstadoOperativo estadoOperativo, int nivelBlindaje) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo);
        this.nivelBlindaje = nivelBlindaje;
    }

    /**
     * Obtiene el nivel de blindaje del vehículo.
     *
     * @return Nivel de blindaje.
     */
    public int getNivelBlindaje() {
        return nivelBlindaje;
    }

    /**
     * Establece el nivel de blindaje del vehículo.
     *
     * @param nivelBlindaje Nuevo nivel de blindaje.
     */
    public void setNivelBlindaje(int nivelBlindaje) {
        this.nivelBlindaje = nivelBlindaje;
    }
}
