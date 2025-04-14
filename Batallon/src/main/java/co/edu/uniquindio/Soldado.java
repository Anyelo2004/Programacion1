package co.edu.uniquindio;

import java.util.LinkedList;

/**
 * Clase que representa un soldado dentro del sistema.
 * Contiene información personal y militar del soldado, como su identificación, rango,
 * especialización, estado y las misiones asignadas.
 */
public class Soldado {

    /**
     * Identificador único del soldado.
     */
    private String id;

    /**
     * Nombre completo del soldado.
     */
    private String nombreCompleto;

    /**
     * Edad del soldado.
     */
    private int edad;

    /**
     * Rango militar del soldado.
     */
    private Rango rango;

    /**
     * Especialización del soldado (por ejemplo: médico, ingeniero, etc.).
     */
    private Especializacion especializacion;

    /**
     * Estado actual del soldado (disponible, en misión, herido, etc.).
     */
    private EstadoSoldado estadoSoldado;

    /**
     * Lista de misiones en las que ha participado el soldado.
     */
    private LinkedList<Mision> listMisiones;

    /**
     * Constructor de la clase Soldado.
     *
     * @param id              Identificador del soldado.
     * @param nombreCompleto  Nombre completo del soldado.
     * @param edad            Edad del soldado.
     * @param rango           Rango del soldado.
     * @param especializacion Especialización del soldado.
     * @param estadoSoldado   Estado actual del soldado.
     */
    public Soldado(String id, String nombreCompleto, int edad, Rango rango, Especializacion especializacion, EstadoSoldado estadoSoldado) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.rango = rango;
        this.especializacion = especializacion;
        this.estadoSoldado = estadoSoldado;
        this.listMisiones = new LinkedList<>();
    }

    // Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Rango getRango() {
        return rango;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

    public Especializacion getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(Especializacion especializacion) {
        this.especializacion = especializacion;
    }

    public EstadoSoldado getEstadoSoldado() {
        return estadoSoldado;
    }

    public void setEstadoSoldado(EstadoSoldado estadoSoldado) {
        this.estadoSoldado = estadoSoldado;
    }

    public LinkedList<Mision> getListMisiones() {
        return listMisiones;
    }

    public void setListMisiones(LinkedList<Mision> listMisiones) {
        this.listMisiones = listMisiones;
    }
}
