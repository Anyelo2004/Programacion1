package co.edu.uniquindio;

import java.time.LocalDate;


public abstract class Persona {

    /**
     * Nombre de la persona.
     */
    protected String nombre;

    /**
     * Apellido de la persona.
     */
    protected String apellido;

    /**
     * Identificación de la persona.
     */
    protected String id;

    /**
     * Fecha de nacimiento de la persona.
     */
    protected LocalDate fechaNacimiento;

    /**
     * Constructor para inicializar una persona con los datos básicos.
     *
     * @param nombre          Nombre de la persona.
     * @param apellido        Apellido de la persona.
     * @param id              Identificación de la persona.
     * @param fechaNacimiento Fecha de nacimiento de la persona.
     */
    public Persona(String nombre, String apellido, String id, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene la identificación de la persona.
     *
     * @return ID de la persona.
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el apellido de la persona.
     *
     * @return Apellido de la persona.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece la fecha de nacimiento de la persona.
     *
     * @param fechaNacimiento Nueva fecha de nacimiento.
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Retorna una representación en cadena del objeto Persona.
     *
     * @return Cadena con los atributos de la persona.
     */
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
