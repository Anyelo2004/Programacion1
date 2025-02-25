public class Main {
    public static void main(String[] args) {
        /**
         * crear guarderia
         */
        Guarderia guarderia = new Guarderia("Guardería Pequeños Pasos", "Calle 123, Ciudad");

        /**
         * crear unos estudiantes
         */
        Estudiante estudiante1 = new Estudiante("Juan Pérez", 4, 'M', "001", "12345678", "Ninguna", "María Pérez", "555-1234");
        Estudiante estudiante2 = new Estudiante("Ana Gómez", 6, 'F', "002", "87654321", "Polen", "Carlos Gómez", "555-5678");
        Estudiante estudiante3 = new Estudiante("Anyelo", 7, 'M', "003", "91726354", "Mujeres", "Carlos Gómez", "555-5678");

        /**
         * añadir los estudiantes
         */
        guarderia.añadirEstudiante(estudiante1);
        guarderia.añadirEstudiante(estudiante2);
        guarderia.añadirEstudiante(estudiante3);

        System.out.println("Lista de estudiantes:");
        for (Estudiante estudiante : guarderia.getListaEstudiantes()) {
            System.out.println(estudiante);
        }
        /**
         * verifica los estudiantes
         */
        System.out.println("¿Estudiante con ID 001 está registrado?: " + guarderia.verificarEstudiante("001"));
        /**
         * actualiza un estudiante
         */
        boolean actualizado = guarderia.actualizarEstudiante("Juanito Pérez", 5, 'M', "001", "Ninguna", "María López", "555-9999");
        System.out.println("¿Estudiante actualizado?: " + actualizado);

        System.out.println("Lista actualizada de estudiantes:");
        for (Estudiante estudiante : guarderia.getListaEstudiantes()) {
            System.out.println(estudiante);
        }
        /**
         * muestra los mayores de 5 años
         */
        System.out.println("Estudiantes mayores de 5 años:");
        for (Estudiante estudiante : guarderia.getListaEstudiantes()) {
            if (estudiante.getEdad() > 5) {
                System.out.println(estudiante);
            }
        }

        /**
         * elimina un estudiante
         */
        guarderia.eliminarEstudiante("002");
        System.out.println("Lista después de eliminar estudiante con ID 002:");
        for (Estudiante estudiante : guarderia.getListaEstudiantes()) {
            System.out.println(estudiante);
        }
    }
}
