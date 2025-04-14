package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.LinkedList;

public class Batallon {
    private String nombre;
    private String id;

    private LinkedList<VehiculoApoyo> listVehiculosApoyo;
    private LinkedList<VehiculoBlindado> listVehiculosBlindados;
    private LinkedList<VehiculoTransporteTropa> listVehiculosTransporteTropa;
    private LinkedList<Vehiculo> listVehiculos;
    private LinkedList<Mision> listMisiones;
    private LinkedList<Soldado> listPersonal;

    /**
     * Constructor de la clase Batallon
     */
    public Batallon(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.listVehiculosApoyo = new LinkedList<>();
        this.listVehiculosBlindados = new LinkedList<>();
        this.listVehiculosTransporteTropa = new LinkedList<>();
        this.listMisiones = new LinkedList<>();
        this.listVehiculos = new LinkedList<>();
        this.listPersonal = new LinkedList<>();
    }

    /**
     * Agrega un nuevo vehículo de transporte de tropas si no existe uno con el mismo ID.
     */
    public boolean agregarVehiculoTransporteTropas(String id, String modelo, int anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo, int capacidadSoldados) {
        boolean flag = false;
        for (VehiculoTransporteTropa vehiculoTransporteTropa : listVehiculosTransporteTropa) {
            if (vehiculoTransporteTropa.getId().equals(id)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            VehiculoTransporteTropa newVehiculoTransporteTropa = new VehiculoTransporteTropa(id, modelo, anioFabricacion, kilometraje, estadoOperativo, capacidadSoldados);
            listVehiculosTransporteTropa.add(newVehiculoTransporteTropa);
        }
        return flag;
    }

    /**
     * Busca un vehículo de transporte de tropas por su ID.
     */
    public VehiculoTransporteTropa buscarVehiculoTransporteTropas(String idVehiculoBuscar) {
        for (VehiculoTransporteTropa vehiculoTransporteTropa : listVehiculosTransporteTropa) {
            if (vehiculoTransporteTropa.getId().equals(idVehiculoBuscar)) {
                return vehiculoTransporteTropa;
            }
        }
        return null;
    }

    /**
     * Actualiza la información de un vehículo de transporte de tropas.
     */
    public boolean actualizarVehiculoTransporteTropa(String idVehiculoActualizar, String modelo, int anioFabricacion,
                                                     double kilometraje, EstadoOperativo estadoOperativo, int capacidadSoldados) {
        boolean flag = false;
        for (VehiculoTransporteTropa vehiculoTransporteTropa : listVehiculosTransporteTropa) {
            if (vehiculoTransporteTropa.getId().equals(idVehiculoActualizar)) {
                vehiculoTransporteTropa.setModelo(modelo);
                vehiculoTransporteTropa.setAnioFabricacion(anioFabricacion);
                vehiculoTransporteTropa.setKilometraje(kilometraje);
                vehiculoTransporteTropa.setEstadoOperativo(estadoOperativo);
                vehiculoTransporteTropa.setCapacidadSoldados(capacidadSoldados);
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * Elimina un vehículo de transporte de tropas por su ID.
     */
    public boolean eliminarVehiculoTransporteTropa(String idVehiculoEliminar) {
        boolean flag = false;
        for (VehiculoTransporteTropa vehiculoTransporteTropa : listVehiculosTransporteTropa) {
            if (vehiculoTransporteTropa.getId().equals(idVehiculoEliminar)) {
                listVehiculosTransporteTropa.remove(vehiculoTransporteTropa);
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * Agrega un vehículo blindado si no existe uno con el mismo ID.
     */
    public boolean agregarVehiculoBlindado(String id, String modelo, int anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo, int nivelBlindaje) {
        boolean flag = false;
        for (VehiculoBlindado newVehiculoBlindado : listVehiculosBlindados) {
            if (newVehiculoBlindado.getId().equals(id)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            VehiculoBlindado newVehiculoBlindado = new VehiculoBlindado(id, modelo, anioFabricacion, kilometraje, estadoOperativo, nivelBlindaje);
            listVehiculosBlindados.add(newVehiculoBlindado);
        }
        return flag;
    }

    /**
     * Busca un vehículo blindado por ID.
     */
    public VehiculoBlindado buscarVehiculoBlindado(String idVehiculoBlindado) {
        for (VehiculoBlindado vehiculoBlindado : listVehiculosBlindados) {
            if (vehiculoBlindado.getId().equals(idVehiculoBlindado)) {
                return vehiculoBlindado;
            }
        }
        return null;
    }

    /**
     * Actualiza un vehículo blindado.
     */
    public boolean actualizarVehiculoBlindado(String idVehiculoActualizar, String modelo, int anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo, int nivelBlindaje) {
        boolean flag = false;
        for (VehiculoBlindado newVehiculoBlindado : listVehiculosBlindados) {
            if (newVehiculoBlindado.getId().equals(idVehiculoActualizar)) {
                newVehiculoBlindado.setModelo(modelo);
                newVehiculoBlindado.setAnioFabricacion(anioFabricacion);
                newVehiculoBlindado.setKilometraje(kilometraje);
                newVehiculoBlindado.setEstadoOperativo(estadoOperativo);
                newVehiculoBlindado.setNivelBlindaje(nivelBlindaje);
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * Elimina un vehículo blindado por su ID.
     */
    public boolean eliminarVehiculoBlindado(String idVehiculoEliminar) {
        boolean flag = false;
        for (VehiculoBlindado newVehiculoBlindado : listVehiculosBlindados) {
            if (newVehiculoBlindado.getId().equals(idVehiculoEliminar)) {
                listVehiculosBlindados.remove(newVehiculoBlindado);
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * Agrega un vehículo de apoyo si no existe uno con el mismo ID.
     */
    public boolean agregarVehiculoApoyo(String id, String modelo, int anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo, TipoFuncion tipoFuncion) {
        boolean flag = false;
        for (VehiculoApoyo newVehiculoApoyo : listVehiculosApoyo) {
            if (newVehiculoApoyo.getId().equals(id)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            VehiculoApoyo newVehiculoApoyo = new VehiculoApoyo(id, modelo, anioFabricacion, kilometraje, estadoOperativo, tipoFuncion);
            listVehiculosApoyo.add(newVehiculoApoyo);
        }
        return flag;
    }

    /**
     * Busca un vehículo Apoyo por ID.
     */
    public VehiculoApoyo buscarVehiculoApoyo(String idVehiculoApoyo) {
        for (VehiculoApoyo vehiculoApoyo : listVehiculosApoyo) {
            if (vehiculoApoyo.getId().equals(idVehiculoApoyo)) {
                return vehiculoApoyo;
            }
        }
        return null;
    }

    /**
     * Actualiza un vehículo Apoyo.
     */
    public boolean actualizarVehiculoApoyo(String idVehiculoActualizar, String modelo, int anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo, TipoFuncion tipoFuncion) {
        boolean flag = false;
        for (VehiculoApoyo newVehiculoApoyo : listVehiculosApoyo) {
            if (newVehiculoApoyo.getId().equals(idVehiculoActualizar)) {
                newVehiculoApoyo.setModelo(modelo);
                newVehiculoApoyo.setAnioFabricacion(anioFabricacion);
                newVehiculoApoyo.setKilometraje(kilometraje);
                newVehiculoApoyo.setEstadoOperativo(estadoOperativo);
                newVehiculoApoyo.setTipoFuncion(tipoFuncion);
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * Elimina un vehículo Apoyo por su ID.
     */
    public boolean eliminarVehiculoApoyo(String idVehiculoEliminar) {
        boolean flag = false;
        for (VehiculoApoyo newVehiculoApoyo : listVehiculosApoyo) {
            if (newVehiculoApoyo.getId().equals(idVehiculoEliminar)) {
                listVehiculosApoyo.remove(newVehiculoApoyo);
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * Agrega una mision si no existe uno con el mismo ID.
     */
    public boolean agregarMision(String idMision, LocalDate fecha, String ubicacion) {
        boolean flag = false;
        for (Mision newMision: listMisiones) {
            if (newMision.getId().equals(idMision)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            Mision newMision = new Mision(idMision, fecha, ubicacion);
            listMisiones.add(newMision);
        }
        return flag;
    }

    /**
     * Busca una mision por ID.
     */
    public Mision buscarMision(String idMision) {
        for (Mision mision : listMisiones) {
            if (mision.getId().equals(idMision)) {
                return mision;
            }
        }
        return null;
    }

    /**
     * Actualiza una mision
     */
    public boolean actualizarMision(String idMision, LocalDate fecha, String ubicacion) {
        boolean flag = false;
        for (Mision mision : listMisiones) {
            if (mision.getId().equals(idMision)) {
                mision.setId(idMision);
                mision.setFecha(fecha);
                mision.setUbicacion(ubicacion);
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * Elimina una mision por su ID.
     */
    public boolean eliminarMision(String idMisionEliminar) {
        boolean flag = false;
        for (Mision mision : listMisiones) {
            if (mision.getId().equals(idMisionEliminar)) {
                listVehiculosApoyo.remove(mision);
                flag = true;
                break;
            }
        }
        return flag;
    }




    /**
     * Calcula el kilometraje promedio de los vehículos de transporte de tropas.
     *
     * @return Promedio de kilometraje.
     */
    public double kilometrajePromedioTropas() {
        double sumaTropas = 0;
        for (VehiculoTransporteTropa newTransporteTropas : listVehiculosTransporteTropa) {
            sumaTropas += newTransporteTropas.getKilometraje();
        }
        return sumaTropas / listVehiculosTransporteTropa.size();
    }

    /**
     * Calcula el kilometraje promedio de los vehículos de apoyo.
     *
     * @return Promedio de kilometraje.
     */
    public double kilometrajePromedioApoyo() {
        double sumaApoyos = 0;
        for (VehiculoApoyo newApoyo : listVehiculosApoyo) {
            sumaApoyos += newApoyo.getKilometraje();
        }
        return sumaApoyos / listVehiculosApoyo.size();
    }

    /**
     * Calcula el kilometraje promedio de los vehículos blindados.
     *
     * @return Promedio de kilometraje.
     */
    public double kilometrajePromedioBlindado() {
        double sumaBlindados = 0;
        for (VehiculoBlindado newBlindado : listVehiculosBlindados) {
            sumaBlindados += newBlindado.getKilometraje();
        }
        return sumaBlindados / listVehiculosBlindados.size();
    }

    /**
     * Metodo para registrar una Mision
     * @param fechaMision
     * @param ubicacionMision
     * @param idVehiculoMision
     * @return
     */

    public boolean registrarMision(LocalDate fechaMision, String ubicacionMision,
                                   String idVehiculoMision) {

        boolean flag = false;

        String cantMisionesActuales = String.valueOf(listMisiones.size() + 1);
        Mision newMision = new Mision(cantMisionesActuales, fechaMision, ubicacionMision);
        for (Vehiculo vehiculo : listVehiculos) {
            if (vehiculo.getId().equals(idVehiculoMision)) {
                newMision.setTheVehiculo(vehiculo);

                LinkedList<Mision> listTempo = vehiculo.getListMisiones();
                listTempo.add(newMision);

                vehiculo.setListMisiones(listTempo);
                flag = true;
                break;
            }
        }

        return flag;

    }


    /**
     * Filtra misiones por ubicación y rango de fechas.
     *
     * @param ubicacion   Ubicación a filtrar.
     * @param fechaInicio Fecha de inicio del filtro.
     * @param fechaFin    Fecha de fin del filtro.
     * @return Lista de misiones filtradas.

    public LinkedList<Mision> filtroMisionesUbiFechas(String ubicacion, LocalDate fechaInicio, LocalDate fechaFin) {
        LinkedList<Mision> misionesFiltro = new LinkedList<>();
        for (Mision i : listMisiones) {
            if (i.getUbicacion().equals(ubicacion) &&
                    ((i.getFecha().isEqual(fechaInicio) || i.getFecha().isAfter(fechaInicio)) &&
                            (i.getFecha().isEqual(fechaFin) || i.getFecha().isBefore(fechaFin)))) {
                misionesFiltro.add(i);
            }
        }
        return misionesFiltro;
    }

    public LinkedList<Vehiculo> buscarVehiculoAnioFabricacion(int anioFabricacion) {
        LinkedList<Vehiculo> vehiculosOrdenados = new LinkedList<>();
        LinkedList<Vehiculo> vehiculosApoyo = new LinkedList<>();
        LinkedList<Vehiculo> vehiculosBlindados = new LinkedList<>();
        LinkedList<Vehiculo> vehiculosTropas = new LinkedList<>();

        for(Vehiculo vehiculo : listVehiculos){
            if(vehiculo.getAnioFabricacion() == anioFabricacion){
                if (vehiculo instanceof VehiculoApoyo){
                    vehiculosApoyo.add(vehiculo);
                } else if (vehiculo instanceof VehiculoBlindado) {
                    vehiculosBlindados.add(vehiculo);
                }else if (vehiculo instanceof VehiculoTransporteTropa){
                    vehiculosTropas.add(vehiculo);
                }
            }
        }

        vehiculosApoyo.sort((v1, v2) -> Integer.compare(v2.getModelo(), v1.getModelo()));
        vehiculosBlindados.sort((v1, v2) -> Integer.compare(v2.getModelo(), v1.getModelo()));
        vehiculosTropas.sort((v1, v2) -> Integer.compare(v2.getModelo(), v1.getModelo()));

        vehiculosOrdenados.addAll(vehiculosApoyo);
        vehiculosOrdenados.addAll(vehiculosBlindados);
        vehiculosOrdenados.addAll(vehiculosTropas);

        return vehiculosOrdenados;
    }
    */
    /**
     *
     * @return
     */
    public String actualizarEstadoVehiculo(){
        String info = "//////////////// Actualizacion de estado de los vehiculos del batallon ////////////////////\n";
        int mantenimiento = 0;
        int mision = 0;
        int disponible =0;
        for (Vehiculo vehiculo : listVehiculos){
            if(vehiculo.getKilometraje() > 5000){
                vehiculo.setEstadoOperativo(EstadoOperativo.EN_MANTENIMIENTO);
                mantenimiento++;
            } else if (vehiculo.getListMisiones().size() > 0) {
                Mision misionVehiculo = vehiculo.getListMisiones().getLast();
                if (misionVehiculo.getFecha() == LocalDate.now() || misionVehiculo.getFecha().isAfter(LocalDate.now())) {
                    vehiculo.setEstadoOperativo(EstadoOperativo.EN_MISION);
                    mision++;
                }
            } else{
                vehiculo.setEstadoOperativo(EstadoOperativo.DISPONIBLE);
                disponible++;
            }
        }
        info+="Vehiculos en mantenimiento: "+mantenimiento+"\n";
        info+="Vehiculos en mision: "+mision+"\n";
        info+="Vehiculos disponibles: "+disponible+"\n";
        return info;
    }

    /**
     * Obtiene una lista de vehículos ordenado de manera descendente por misiones completadas.
     *
     * @return Lista de vehículos.
     */
    public LinkedList<Vehiculo> ordenarVehiculoPorMisionesCompletadas(){
        LinkedList<Vehiculo> listaVehiculos = new LinkedList<>();
        for(Vehiculo vehiculo : listVehiculos){
            listaVehiculos.add(vehiculo);
        }
        for(int i =0; i < listaVehiculos.size() - 1; i++){
            for(int j = 0; j < listaVehiculos.size() - 1 - i; j++){
                Vehiculo v1 = listaVehiculos.get(j);
                Vehiculo v2 = listaVehiculos.get(j+1);

                if(v1.getMisionesCompletadas() < v2.getMisionesCompletadas()){
                    listaVehiculos.set(i, v2);
                    listaVehiculos.set(j+1, v1);
                }
            }
        }
        return listaVehiculos;
    }

    /**
     * Obtiene una lista de vehículos con más de 50 misiones completadas.
     *
     * @return Lista de vehículos.
     */
    public LinkedList<Vehiculo> obtenerVehiculosCantMisiones() {
        LinkedList<Vehiculo> vehiculosMisionesCompletadas = new LinkedList<>();

        for (VehiculoApoyo vehiculo : listVehiculosApoyo) {
            if (vehiculo.getMisionesCompletadas() > 50) {
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }

        for (VehiculoBlindado vehiculo : listVehiculosBlindados) {
            if (vehiculo.getMisionesCompletadas() > 50) {
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }

        for (VehiculoTransporteTropa vehiculo : listVehiculosTransporteTropa) {
            if (vehiculo.getMisionesCompletadas() > 50) {
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }

        return vehiculosMisionesCompletadas;
    }

    /**
     * agregar un soldado
     * @param id
     * @param nombreCompleto
     * @param edad
     * @param rango
     * @param especializacion
     * @param estadoSoldado
     * @return
     */


    public boolean agregarSoldado(String id, String nombreCompleto, int edad, Rango rango, Especializacion especializacion, EstadoSoldado estadoSoldado){
        boolean flag = false;
        for(Soldado newSoldado : listPersonal){
            if(newSoldado.getId().equals(id)){
                flag = true;
                break;
            }
        }
        if(!flag){
            Soldado newSoldado = new Soldado(id, nombreCompleto, edad,rango, especializacion, estadoSoldado);
            listPersonal.add(newSoldado);
        }
        return flag;
    }

    /**
     * Actualiza un soldado.
     */
    public boolean actualizarSoldado(String idSoldadoActualizar, String nombreCompleto, int edad, Rango rango,
                                     Especializacion especializacion, EstadoSoldado estadoSoldado) {
        boolean flag = false;
        for (Soldado newSoldado : listPersonal) {
            if (newSoldado.getId().equals(idSoldadoActualizar)) {
                newSoldado.setNombreCompleto(nombreCompleto);
                newSoldado.setEdad(edad);
                newSoldado.setRango(rango);
                newSoldado.setEspecializacion(especializacion);
                newSoldado.setEstadoSoldado(estadoSoldado);
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * Elimina un soldado por su ID.
     */
    public boolean eliminarSoldado(String idSoldadoEliminar) {
        boolean flag = false;
        for (Soldado soldado : listPersonal) {
            if (soldado.getId().equals(idSoldadoEliminar)) {
                listVehiculosApoyo.remove(soldado);
                flag = true;
                break;
            }
        }
        return flag;
    }


    /**
     * metodo para asignar un soldado a una mision
     * @param idSoldado
     * @param idMision
     * @return
     */

    public boolean asignarSoldadoMision (String idSoldado, String idMision){
        boolean asignar = false;
        Mision newMision = null;
        Soldado newSoldado1 = null;

        for(Mision newMision1 : listMisiones){

            if(newMision1.getId().equals(idMision)){
                newMision = newMision1;
                break;
            }
        }

        for (Soldado newSoldado : listPersonal){
            if(newSoldado.getId().equals(idSoldado)&&newSoldado.getEstadoSoldado().equals(EstadoSoldado.DISPONIBLE)){
                newSoldado1= newSoldado;
            }
        }if(newMision!=null&&newSoldado1!=null){
            newMision.getPersonal().add(newSoldado1);
            newSoldado1.setEstadoSoldado(EstadoSoldado.NO_DISPONIBLE);
            asignar = true;
        }
        return asignar;

    }

    /**
     * Metodo para liberar soldado
     * @param listPersonal
     * @param fechaMision
     * @return
     */

    public boolean liberarSoldados(LinkedList<Soldado> listPersonal, LocalDate fechaMision) {
        LocalDate fechaActual = LocalDate.now();
        boolean soldadosLiberados = false;

        if (fechaMision.isBefore(fechaActual)) {
            for (Soldado soldado : listPersonal) {
                soldado.setEstadoSoldado(EstadoSoldado.DISPONIBLE);
                soldadosLiberados = true;
            }
        }

        return soldadosLiberados;
    }
    
    /**
     * Busca un soldado por ID.
     */
    public Soldado buscarSoldadoId(String idSoldado) {
        for (Soldado soldado : listPersonal) {
            if (soldado.getId().equals(idSoldado)) {
                return soldado;
            }
        }
        return null;
    }
    
    /**
     * Busca un soldado por especialidad.
     */
    public LinkedList<Soldado> buscarSoldadoEspecialidad(Especializacion especializacionBuscar) {
        LinkedList<Soldado> listSoldadosEspecialidad = new LinkedList<>();
        for (Soldado soldado : listPersonal) {
            if (soldado.getEspecializacion().equals(especializacionBuscar)) {
                listSoldadosEspecialidad.add(soldado);
            }
        }
        return listSoldadosEspecialidad;
    }

    /**
     * Soldados disponibles por rango
     * @param indexRango
     * @return
     */

    public LinkedList<Soldado> soldadosDisponiblesRango(Rango indexRango) {
        LinkedList<Soldado> listSoldadosRango = new LinkedList<>();
        for (Soldado soldado : listPersonal) {
            if (soldado.getRango().equals(indexRango)) {
                listSoldadosRango.add(soldado);
            }
        }
        return listSoldadosRango;
    }

    /**
     * Metodo para hallar el promedio de edad de los soldados
     * @return
     */

    public double calcularPromedioEdadSoldado(){
        double promedio = 0;
        int sumaEdad = 0;
        for (Soldado soldado : listPersonal) {
            sumaEdad += soldado.getEdad();
        }
        return(double) sumaEdad / listPersonal.size();

    }





    // -------------------- Getters y Setters --------------------

    /**
     * Obtiene el nombre del batallón.
     *
     * @return Nombre del batallón.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del batallón.
     *
     * @param nombre Nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el ID del batallón.
     *
     * @return ID del batallón.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID del batallón.
     *
     * @param id ID a establecer.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene la lista de vehículos de apoyo.
     *
     * @return Lista de vehículos de apoyo.
     */
    public LinkedList<VehiculoApoyo> getListVehiculosApoyo() {
        return listVehiculosApoyo;
    }

    /**
     * Establece la lista de vehículos de apoyo.
     *
     * @param listVehiculosApoyo Lista de vehículos de apoyo.
     */
    public void setListVehiculosApoyo(LinkedList<VehiculoApoyo> listVehiculosApoyo) {
        this.listVehiculosApoyo = listVehiculosApoyo;
    }

    /**
     * Obtiene la lista de vehículos blindados.
     *
     * @return Lista de vehículos blindados.
     */
    public LinkedList<VehiculoBlindado> getListVehiculosBlindados() {
        return listVehiculosBlindados;
    }

    /**
     * Establece la lista de vehículos blindados.
     *
     * @param listVehiculosBlindados Lista de vehículos blindados.
     */
    public void setListVehiculosBlindados(LinkedList<VehiculoBlindado> listVehiculosBlindados) {
        this.listVehiculosBlindados = listVehiculosBlindados;
    }

    /**
     * Obtiene la lista de vehículos de transporte de tropas.
     *
     * @return Lista de vehículos de transporte de tropas.
     */
    public LinkedList<VehiculoTransporteTropa> getListVehiculosTransporteTropa() {
        return listVehiculosTransporteTropa;
    }

    /**
     * Establece la lista de vehículos de transporte de tropas.
     *
     * @param listVehiculosTransporteTropa Lista de vehículos de transporte de tropas.
     */
    public void setListVehiculosTransporteTropa(LinkedList<VehiculoTransporteTropa> listVehiculosTransporteTropa) {
        this.listVehiculosTransporteTropa = listVehiculosTransporteTropa;
    }

    /**
     * Obtiene la lista general de vehículos.
     *
     * @return Lista de vehículos.
     */
    public LinkedList<Vehiculo> getListVehiculos() {
        return listVehiculos;
    }

    /**
     * Establece la lista general de vehículos.
     *
     * @param listVehiculos Lista de vehículos.
     */
    public void setListVehiculos(LinkedList<Vehiculo> listVehiculos) {
        this.listVehiculos = listVehiculos;
    }

    /**
     * Obtiene la lista de misiones.
     *
     * @return Lista de misiones.
     */
    public LinkedList<Mision> getListMisiones() {
        return listMisiones;
    }

    /**
     * Establece la lista de misiones.
     *
     * @param listMisiones Lista de misiones.
     */
    public void setListMisiones(LinkedList<Mision> listMisiones) {
        this.listMisiones = listMisiones;
    }

    /**
     * Obtiene la lista de soldados.
     *
     * @return Lista de soldados.
     */
    public LinkedList<Soldado> getListSoldados() {
        return listPersonal;
    }

    /**
     * Establece la lista de soldados.
     *
     * @param listSoldado Lista de soldados.
     */
    public void setListSoldados(LinkedList<Soldado> listSoldado) {
        this.listPersonal = listSoldado;
    }
}
