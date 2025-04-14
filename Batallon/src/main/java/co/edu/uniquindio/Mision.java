package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 * Representa una misión asignada dentro del sistema militar. Cada misión tiene un identificador,
 * una fecha, una ubicación, una lista de soldados asignados y un vehículo asociado.
 */
public class Mision {

    private String id;
    private LocalDate fecha;
    private String ubicacion;
    private LinkedList<Soldado> personal;
    private Vehiculo theVehiculo;

    /**
     * Crea una nueva misión con los parámetros especificados.
     *
     * @param id        Identificador único de la misión.
     * @param fecha     Fecha programada de la misión.
     * @param ubicacion Ubicación geográfica donde se llevará a cabo la misión.
     */
    public Mision(String id, LocalDate fecha, String ubicacion) {
        this.id = id;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        personal = new LinkedList<>();
    }

    /**
     * Constructor vacío que inicializa la lista de personal.
     */
    public Mision() {
        personal = new LinkedList<>();
    }

    /**
     * Obtiene el identificador de la misión.
     *
     * @return Identificador de la misión.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador de la misión.
     *
     * @param id Identificador único de la misión.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene la fecha en que se realizará la misión.
     *
     * @return Fecha de la misión.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha en que se llevará a cabo la misión.
     *
     * @param fecha Fecha de la misión.
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la ubicación de la misión.
     *
     * @return Ubicación geográfica de la misión.
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Establece la ubicación de la misión.
     *
     * @param ubicacion Ubicación geográfica de la misión.
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Obtiene la lista de soldados asignados a la misión.
     *
     * @return Lista de personal militar asignado.
     */
    public LinkedList<Soldado> getPersonal() {
        return personal;
    }

    /**
     * Establece la lista de soldados asignados a la misión.
     *
     * @param personal Lista de soldados.
     */
    public void setPersonal(LinkedList<Soldado> personal) {
        this.personal = personal;
    }

    /**
     * Obtiene el vehículo asignado a la misión.
     *
     * @return Vehículo relacionado con la misión.
     */
    public Vehiculo getTheVehiculo() {
        return theVehiculo;
    }

    /**
     * Asigna un vehículo a la misión.
     *
     * @param theVehiculo Vehículo a ser utilizado en la misión.
     */
    public void setTheVehiculo(Vehiculo theVehiculo) {
        this.theVehiculo = theVehiculo;
    }
}
