package co.edu.uniquindio;

import java.util.LinkedList;

/**
 * Clase abstracta que representa un vehículo militar.
 * Contiene información general como el modelo, año de fabricación, estado operativo,
 * kilometraje y las misiones en las que ha participado.
 *
 * Esta clase debe ser extendida por tipos específicos de vehículos como {@link VehiculoBlindado},
 * {@link VehiculoApoyo} o {@link VehiculoTransporteTropa}.
 */
public abstract class Vehiculo {

    /**
     * Identificador único del vehículo.
     */
    protected String id;

    /**
     * Modelo del vehículo.
     */
    protected String modelo;

    /**
     * Año de fabricación del vehículo.
     */
    protected int anioFabricacion;

    /**
     * Kilometraje actual del vehículo.
     */
    protected double kilometraje;

    /**
     * Número de misiones completadas por el vehículo.
     */
    protected int misionesCompletadas;

    /**
     * Estado operativo actual del vehículo.
     */
    protected EstadoOperativo estadoOperativo;

    /**
     * Lista de misiones en las que ha participado el vehículo.
     */
    protected LinkedList<Mision> listMisiones;

    /**
     * Constructor principal para inicializar los atributos de un vehículo.
     *
     * @param id               Identificador único del vehículo.
     * @param modelo           Modelo del vehículo.
     * @param anioFabricacion  Año de fabricación del vehículo.
     * @param kilometraje      Kilometraje actual del vehículo.
     * @param estadoOperativo  Estado operativo actual del vehículo.
     */
    public Vehiculo(String id, String modelo, int anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.misionesCompletadas = 0;
        this.estadoOperativo = estadoOperativo;
        this.listMisiones = new LinkedList<>();
    }

    /**
     * Agrega una misión a la lista de misiones del vehículo.
     *
     * @param newMision Misión a agregar.
     * @return {@code true} si la misión fue agregada exitosamente, {@code false} en caso contrario.
     */
    public boolean agregarMision(Mision newMision) {
        return listMisiones.add(newMision);
    }

    // Getters y Setters

    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(EstadoOperativo estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getMisionesCompletadas() {
        return misionesCompletadas;
    }

    public void setMisionesCompletadas(int misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }

    public LinkedList<Mision> getListMisiones() {
        return listMisiones;
    }

    public void setListMisiones(LinkedList<Mision> listMisiones) {
        this.listMisiones = listMisiones;
    }
}
