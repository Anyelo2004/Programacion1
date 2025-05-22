package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


public class Conductor extends Persona {

    /** Lista de vehículos asignados al conductor. */
    private List<Vehiculo> vehiculosAsignados;

    /**
     * Crea una nueva instancia de {@code Conductor} con los datos personales proporcionados.
     *
     * @param nombre Nombre del conductor.
     * @param apellido Apellido del conductor.
     * @param id Identificación del conductor.
     * @param fechaNacimiento Fecha de nacimiento del conductor.
     */
    public Conductor(String nombre, String apellido, String id, LocalDate fechaNacimiento) {
        super(nombre, apellido, id, fechaNacimiento);
        this.vehiculosAsignados = new LinkedList<>();
    }

    /**
     * Obtiene la lista de vehículos que han sido asignados al conductor.
     *
     * @return Lista de vehículos asignados.
     */
    public List<Vehiculo> getVehiculosAsignados() {
        return vehiculosAsignados;
    }

    /**
     * Calcula el total de dinero que el conductor ha pagado en peajes,
     * considerando el número de peajes pagados por cada vehículo asignado.
     *
     * @return Total pagado en peajes.
     */
    public double TotalPagadoEnPeajes() {
        double total = 0;
        for (Vehiculo vehiculo : vehiculosAsignados) {
            total += vehiculo.calcularPeaje() * vehiculo.getNumeroPeajesPagados();
        }
        return total;
    }

    /**
     * Asigna un vehículo al conductor.
     *
     * @param vehiculo Vehículo a asignar.
     */
    public void asignarVehiculo(Vehiculo vehiculo) {
        vehiculosAsignados.add(vehiculo);
    }

    /**
     * Filtra y devuelve los vehículos asignados al conductor según el tipo especificado.
     *
     * @param tipo Tipo de vehículo (por ejemplo: "carro", "moto", "camion").
     * @return Lista de vehículos del tipo especificado.
     */
    public List<Vehiculo> obtenerVehiculosPorTipo(String tipo) {
        List<Vehiculo> vehiculosFiltrados = new LinkedList<>();

        for (Vehiculo vehiculo : vehiculosAsignados) {
            switch (tipo.toLowerCase()) {
                case "carro":
                    if (vehiculo instanceof Carro) {
                        vehiculosFiltrados.add(vehiculo);
                    }
                    break;
                case "moto":
                    if (vehiculo instanceof Moto) {
                        vehiculosFiltrados.add(vehiculo);
                    }
                    break;
                case "camion":
                    if (vehiculo instanceof Camion) {
                        vehiculosFiltrados.add(vehiculo);
                    }
                    break;
                default:
                    System.out.println("Tipo de vehículo no reconocido: " + tipo);
                    break;
            }
        }

        return vehiculosFiltrados;
    }
}
