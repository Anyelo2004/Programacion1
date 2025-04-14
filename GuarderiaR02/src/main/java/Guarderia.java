import java.util.Collection;
import java.util.LinkedList;

public class Guarderia {
    public String nombre;
    public String direccion;
    public Collection<Estudiante> listaEstudiantes;

    /**
     * Constructor de la clase Guarderia
     * @param nombre
     * @param direccion
     */
    public Guarderia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        listaEstudiantes = new LinkedList<>();
    }

    /**
     * get de nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * set de nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * get de direccion
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * set de direccion
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * get de la lista de estudiantes
     * @return
     */
    public Collection<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    /**
     * set de lista de estudiantes
     * @param listaEstudiantes
     */
    public void setListaEstudiantes(Collection<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    /**
     * metodo para añadir a un estudiante a la lista
     * @param estudiante
     */
    public void añadirEstudiante (Estudiante estudiante){
        if(!verificarEstudiante(estudiante.getId())){
            listaEstudiantes.add(estudiante);
        }
    }

    /**
     * metodo para verificar si existe el estudiantes en la lista
     * @param id
     * @return
     */
    public boolean verificarEstudiante (String id){
        boolean centinela = false;
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getId().equals(id)); {
                centinela = true;
            }
        }
        return centinela;

    }

    /**
     * metodo para eliminar un estudiante de una lista
     * @param id
     */
    public void eliminarEstudiante(String id){
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getId().equals(id)) {
                listaEstudiantes.remove(estudiante);
                break;
            }
        }
    }

    /**
     * metodo para actualizar un estudiante en una lista
     * @param nombre
     * @param edad
     * @param genero
     * @param id
     * @param alergia
     * @param nombreAcudiente
     * @param numeroAcudiente
     * @return
     */
    public boolean actualizarEstudiante(String nombre, int edad, char genero, String id,  String alergia, String nombreAcudiente, String numeroAcudiente){
        boolean centinela = false;
        for (Estudiante estudiante : listaEstudiantes) {
            if(estudiante.getId() == id){
                estudiante.setNombre(nombre);
                estudiante.setEdad(edad);
                estudiante.setGenero(genero);
                estudiante.setId(id);
                estudiante.setNombreAcudiente(nombreAcudiente);
                estudiante.setNumeroAcudiente(numeroAcudiente);
                return true;

            }
        }
        return false;
    }

    /**
     * metodo para ver los mayores de 5 años
     * @return
     */
    public boolean identificarMayores5(int edad){
        Boolean mayor = false;
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.edad > 5) {
                mayor = true;
            }
        }
        return mayor;
    }

    @Override
    public String toString() {
        return "Guarderia{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}
