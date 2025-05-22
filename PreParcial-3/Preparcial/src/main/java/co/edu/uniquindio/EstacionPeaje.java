package co.edu.uniquindio;

import java.util.LinkedList;
import java.util.List;


public class EstacionPeaje {

    /** Nombre de la estación de peaje. */
    private String nombre;

    /** Departamento donde se encuentra ubicada la estación. */
    private String departamento;

    /** Monto total recaudado en la estación. */
    private double totalRecaudado;

    /** Lista de vehículos que han pasado por la estación. */
    private List<Vehiculo> vehiculosQuePasaron;

    /** Lista de recaudadores asignados a la estación. */
    private List<Recaudador> recaudadoresPeajes;

    /** Lista de conductores registrados en la estación. */
    private List<Conductor> listaConductores;

    /**
     * Crea una nueva instancia de la estación de peaje con su nombre y departamento.
     *
     * @param nombre Nombre de la estación.
     * @param departamento Departamento donde está ubicada la estación.
     */
    public EstacionPeaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.totalRecaudado = 0;
        this.vehiculosQuePasaron = new LinkedList<>();
        this.recaudadoresPeajes = new LinkedList<>();
        this.listaConductores = new LinkedList<>();
    }

    // Getters y Setters

    /**
     * Retorna el nombre de la estación.
     *
     * @return Nombre de la estación.
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna el departamento donde se encuentra la estación.
     *
     * @return Nombre del departamento.
     */
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Retorna el total recaudado en la estación.
     *
     * @return Total recaudado.
     */
    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    /**
     * Retorna la lista de vehículos que han pasado por la estación.
     *
     * @return Lista de vehículos.
     */
    public List<Vehiculo> getVehiculosQuePasaron() {
        return vehiculosQuePasaron;
    }

    public void setVehiculosQuePasaron(List<Vehiculo> vehiculosQuePasaron) {
        this.vehiculosQuePasaron = vehiculosQuePasaron;
    }

    public List<Vehiculo> getVehiculosPasados() {
        return vehiculosQuePasaron;
    }

    public void setVehiculosPasados(List<Vehiculo> vehiculosPasados) {
        this.vehiculosQuePasaron = vehiculosPasados;
    }

    /**
     * Retorna la lista de recaudadores asignados a la estación.
     *
     * @return Lista de recaudadores.
     */
    public List<Recaudador> getRecaudadoresPeajes() {
        return recaudadoresPeajes;
    }

    public void setRecaudadoresPeajes(List<Recaudador> recaudadoresPeajes) {
        this.recaudadoresPeajes = recaudadoresPeajes;
    }

    /**
     * Retorna la lista de conductores registrados en la estación.
     *
     * @return Lista de conductores.
     */
    public List<Conductor> getListaConductores() {
        return listaConductores;
    }

    public void setListaConductores(List<Conductor> listaConductores) {
        this.listaConductores = listaConductores;
    }

    /**
     * Imprime información detallada de todos los vehículos que han pasado por la estación,
     * clasificándolos por tipo y calculando el total recaudado.
     */
    public void imprimirVehiculos() {
        List<Carro> carrosQuePasaronPeaje = new LinkedList<>();
        List<Camion> camionesQuePasaronPeaje = new LinkedList<>();
        List<Moto> motosQuePasaronPeaje = new LinkedList<>();

        for (Vehiculo vehiculo : vehiculosQuePasaron) {
            if (vehiculo instanceof Carro) {
                carrosQuePasaronPeaje.add((Carro) vehiculo);
            } else if (vehiculo instanceof Camion) {
                camionesQuePasaronPeaje.add((Camion) vehiculo);
            } else if (vehiculo instanceof Moto) {
                motosQuePasaronPeaje.add((Moto) vehiculo);
            }
        }

        double totalRecaudado = 0;
        System.out.println("Total de vehículos que pasaron el peaje: " + vehiculosQuePasaron.size());
        System.out.println();

        System.out.println(" Carros:");
        for (Carro carro : carrosQuePasaronPeaje) {
            double costo = carro.calcularPeaje();
            totalRecaudado += costo;
            System.out.printf("Carro %s → Costo peaje: %.2f\n", carro, costo);
            System.out.println("   - Valor base: $10,000");
            System.out.println("   - Descuento 20% si es eléctrico, 10% si es público");
            System.out.println();
        }

        System.out.println(" Motos:");
        for (Moto moto : motosQuePasaronPeaje) {
            double costo = moto.calcularPeaje();
            totalRecaudado += costo;
            System.out.printf("Moto %s → Costo peaje: %.2f\n", moto, costo);
            System.out.println("   - Valor base: $5,000");
            System.out.println("   - Recargo de $2,000 si el cilindraje > 200 cc");
            System.out.println();
        }

        System.out.println("Camiones:");
        for (Camion camion : camionesQuePasaronPeaje) {
            double costo = camion.calcularPeaje();
            totalRecaudado += costo;
            System.out.printf("Camión %s → Costo peaje: %.2f\n", camion, costo);
            System.out.println("   - Valor base: $7,000 por eje");
            System.out.println("   - Recargo 10% si la carga > 10 toneladas");
            System.out.println();
        }

        System.out.printf(" Total recaudado en peajes: %.2f\n", totalRecaudado);
        System.out.println();

        System.out.println(" Resumen:");
        System.out.println("   - Carros que pasaron: " + carrosQuePasaronPeaje.size());
        System.out.println("   - Motos que pasaron: " + motosQuePasaronPeaje.size());
        System.out.println("   - Camiones que pasaron: " + camionesQuePasaronPeaje.size());
    }

    /**
     * Busca un recaudador en la estación con base en su nombre y apellido.
     *
     * @param nombre Nombre del recaudador.
     * @param apellido Apellido del recaudador.
     * @return Recaudador encontrado o {@code null} si no existe.
     */
    public Recaudador buscarRecaudador(String nombre, String apellido) {
        String nombreBuscado = (nombre + apellido).replaceAll("\\s+", "").toLowerCase();
        for (Recaudador recaudador : recaudadoresPeajes) {
            String nombreCompleto = (recaudador.getNombre() + recaudador.getApellido())
                    .replaceAll("\\s+", "").toLowerCase();
            if (nombreCompleto.equals(nombreBuscado)) {
                return recaudador;
            }
        }
        return null;
    }

    /**
     * Retorna una lista de conductores que tienen asignados camiones con capacidad mayor a 10 toneladas.
     *
     * @return Lista de conductores con camiones pesados.
     */
    public List<Conductor> conductoresConCamionMayor10Toneladas() {
        List<Conductor> conductoresResultantes = new LinkedList<>();
        for (Conductor conductor : listaConductores) {
            for (Vehiculo vehiculo : conductor.getVehiculosAsignados()) {
                if (vehiculo instanceof Camion) {
                    Camion camion = (Camion) vehiculo;
                    if (camion.getCapacidadToneladas() > 10) {
                        conductoresResultantes.add(conductor);
                        break;
                    }
                }
            }
        }
        return conductoresResultantes;
    }

    /**
     * Alternativa de método para obtener conductores con camiones de más de 10 toneladas.
     * Es redundante con {@link #conductoresConCamionMayor10Toneladas()}.
     *
     * @return Lista de conductores con camiones pesados.
     */
    public LinkedList<Conductor> CamionMayorA10Toneladas() {
        LinkedList<Conductor> conductoresResultantes = new LinkedList<>();
        for (Conductor conductor : listaConductores) {
            for (Vehiculo vehiculo : conductor.getVehiculosAsignados()) {
                Camion camion = (Camion) vehiculo;
                if (camion.getCapacidadToneladas() > 10) {
                    conductoresResultantes.add(conductor);
                    break;
                }
            }
        }
        return conductoresResultantes;
    }

    /**
     * Retorna una representación en cadena de la estación de peaje.
     *
     * @return Cadena con la información de la estación.
     */
    @Override
    public String toString() {
        return "EstacionPeaje{" +
                "nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", totalRecaudado=" + totalRecaudado +
                ", vehiculosQuePasaron=" + vehiculosQuePasaron +
                ", recaudadoresPeajes=" + recaudadoresPeajes +
                ", listaConductores=" + listaConductores +
                '}';
    }
}
