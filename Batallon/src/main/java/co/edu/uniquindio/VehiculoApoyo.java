package co.edu.uniquindio;

/**
 * Representa un vehículo de apoyo con una función específica dentro de una misión.
 * Extiende la clase {@link Vehiculo} y añade el atributo {@link TipoFuncion}.
 */
public class VehiculoApoyo extends Vehiculo {

    /**
     * Tipo de función que desempeña el vehículo de apoyo (por ejemplo, logístico, médico, etc.).
     */
    private TipoFuncion tipoFuncion;

    /**
     * Crea una nueva instancia de VehiculoApoyo con los datos especificados.
     *
     * @param id               Identificador único del vehículo.
     * @param modelo           Modelo del vehículo.
     * @param anioFabricacion  Año de fabricación del vehículo.
     * @param kilometraje      Kilometraje actual del vehículo.
     * @param estadoOperativo  Estado operativo actual del vehículo.
     * @param tipoFuncion      Tipo de función asignada al vehículo.
     */
    public VehiculoApoyo(String id, String modelo, int anioFabricacion, double kilometraje,
                         EstadoOperativo estadoOperativo, TipoFuncion tipoFuncion) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo);
        this.tipoFuncion = tipoFuncion;
    }

    /**
     * Obtiene el tipo de función que desempeña el vehículo.
     *
     * @return Tipo de función del vehículo.
     */
    public TipoFuncion getTipoFuncion() {
        return tipoFuncion;
    }

    /**
     * Establece el tipo de función que desempeñará el vehículo.
     *
     * @param tipoFuncion Nueva función del vehículo.
     */
    public void setTipoFuncion(TipoFuncion tipoFuncion) {
        this.tipoFuncion = tipoFuncion;
    }
}
