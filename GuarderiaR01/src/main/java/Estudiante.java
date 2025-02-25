public class Estudiante {
    public String nombre;
    public int edad;
    public char genero;
    public String id;
    public String alergia;
    public String nombreAcudiente;
    public String numeroAcudiente;

    /**
     * Constructor de la clase Estudiante
     * @param nombre
     * @param edad
     * @param genero
     * @param id
     * @param documentoIdentidad
     * @param alergia
     * @param nombreAcudiente
     * @param numeroAcudiente
     */

    public Estudiante(String nombre, int edad, char genero, String id, String documentoIdentidad, String alergia, String nombreAcudiente, String numeroAcudiente) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.id = id;
        this.alergia = alergia;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroAcudiente = numeroAcudiente;
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
     * get de edad
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * set de edad
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * get de genero
     * @return
     */
    public char getGenero() {
        return genero;
    }

    /**
     * set de genero
     * @param genero
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * get de id
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set de id
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get de alergia
     * @return
     */
    public String getAlergia() {
        return alergia;
    }

    /**
     * get de alergia
     * @param alergia
     */
    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    /**
     * get de nombre del acudiente
     * @return
     */
    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    /**
     * set del nombre del acudiente
     * @param nombreAcudiente
     */
    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    /**
     * get numero de acudiente
     * @return
     */
    public String getNumeroAcudiente() {
        return numeroAcudiente;
    }

    /**
     * set numero de acudiente
     * @param numeroAcudiente
     */
    public void setNumeroAcudiente(String numeroAcudiente) {
        this.numeroAcudiente = numeroAcudiente;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                ", id='" + id + '\'' +
                ", alergia='" + alergia + '\'' +
                ", nombreAcudiente='" + nombreAcudiente + '\'' +
                ", numeroAcudiente='" + numeroAcudiente + '\'' +
                '}';
    }
}
