package co.edu.uniquindio;

import java.time.LocalDate;

/**
 * Clase que representa a un recaudador de una estación de peaje.
 * Hereda de la clase abstracta {@link Persona}.
 */
public class Recaudador extends Persona {

    /**
     * Sueldo mensual del recaudador.
     */
    private double sueldoMensual;

    /**
     * Constructor que inicializa un recaudador con los datos personales y el sueldo.
     *
     * @param nombre          Nombre del recaudador.
     * @param apellido        Apellido del recaudador.
     * @param id              Identificación del recaudador.
     * @param fechaNacimiento Fecha de nacimiento del recaudador.
     * @param sueldoMensual   Sueldo mensual del recaudador.
     */
    public Recaudador(String nombre, String apellido, String id, LocalDate fechaNacimiento, double sueldoMensual) {
        super(nombre, apellido, id, fechaNacimiento);
        this.sueldoMensual = sueldoMensual;
    }

    /**
     * Establece el sueldo mensual del recaudador.
     *
     * @param sueldoMensual Nuevo sueldo mensual.
     */
    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    /**
     * Retorna el sueldo mensual del recaudador.
     *
     * @return Sueldo mensual.
     */
    public double getSueldoMensual() {
        return sueldoMensual;
    }

    /**
     * Retorna una representación en cadena del objeto Recaudador.
     *
     * @return Cadena con los atributos del recaudador.
     */
    @Override
    public String toString() {
        return "Recaudador{" +
                "sueldoMensual=" + sueldoMensual +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
