package co.edu.uniquindio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.logging.Logger;

class BatallonTest {

    private static final Logger LOG = Logger.getLogger(BatallonTest.class.getName());
    @Test
    @DisplayName("Test Asignar soldado a una misión")
    public void testAsignarSoldado() {
        LOG.info("iniciando prueba testAsignarSoldado");
        LinkedList <Soldado>  ListPersonal = new LinkedList<>();
        Batallon batallonTest = new Batallon("EL cerro","1234");
        Mision misionTest = new Mision("1", LocalDate.of(2025,04,12),"Génova");
        Soldado soldadoTest = new Soldado("00","Carlos",25,Rango.SOLDADO,Especializacion.COMUNICACION,EstadoSoldado.DISPONIBLE);
        Soldado soldado1 = new Soldado("001", "Carlos Ramírez",29,Rango.CABO,Especializacion.MEDICO,EstadoSoldado.DISPONIBLE);
        Soldado soldado2 = new Soldado("002", "Luis Torres", 32, Rango.SARGENTO, Especializacion.LOGISTICA, EstadoSoldado.NO_DISPONIBLE);
        Soldado soldado3 = new Soldado("003", "Ana Martínez", 27, Rango.SOLDADO, Especializacion.COMUNICACION, EstadoSoldado.DISPONIBLE);
        Soldado soldado4 = new Soldado("004", "José Pérez", 35, Rango.CABO, Especializacion.MEDICO, EstadoSoldado.NO_DISPONIBLE);
        Soldado soldado5 = new Soldado("005", "María Gómez", 30, Rango.SARGENTO, Especializacion.LOGISTICA, EstadoSoldado.DISPONIBLE);


        batallonTest.getListMisiones().add(misionTest);
        batallonTest.getListSoldados().add(soldadoTest);

        ListPersonal.add(soldado1);
        ListPersonal.add(soldado2);
        ListPersonal.add(soldado3);
        ListPersonal.add(soldado4);
        ListPersonal.add(soldado5);

        boolean result = batallonTest.asignarSoldadoMision("00","1");
        assertTrue(result);

        LOG.info("finalizando test asignarSoldado");
    }

    @Test
    @DisplayName("Test liberarSoldado")
    public void testLiberarSoldado() {
        LOG.info("iniciando prueba testLiberarSoldado");

        Batallon batalonTest = new Batallon("1234","Octavo Brigada");
        Mision misionTest = new Mision("345",LocalDate.of(2024,03,12), "Armenia");

        LinkedList <Soldado>  listpersonal = new LinkedList<>();
        Soldado soldado1 = new Soldado("001", "Carlos Ramírez",29,Rango.CABO,Especializacion.MEDICO,EstadoSoldado.NO_DISPONIBLE);
        Soldado soldado2 = new Soldado("002", "Luis Torres", 32, Rango.SARGENTO, Especializacion.LOGISTICA, EstadoSoldado.NO_DISPONIBLE);
        Soldado soldado3 = new Soldado("003", "Ana Martínez", 27, Rango.SOLDADO, Especializacion.COMUNICACION, EstadoSoldado.NO_DISPONIBLE);
        Soldado soldado4 = new Soldado("004", "José Pérez", 35, Rango.CABO, Especializacion.MEDICO, EstadoSoldado.NO_DISPONIBLE);
        Soldado soldado5 = new Soldado("005", "María Gómez", 30, Rango.SARGENTO, Especializacion.LOGISTICA, EstadoSoldado.NO_DISPONIBLE);

        listpersonal.add(soldado1);
        listpersonal.add(soldado2);
        listpersonal.add(soldado3);
        listpersonal.add(soldado4);
        listpersonal.add(soldado5);

        boolean result = batalonTest.liberarSoldados(listpersonal,misionTest.getFecha());
        assertTrue(result);
        assertEquals(EstadoSoldado.DISPONIBLE, soldado1.getEstadoSoldado());
        assertEquals(EstadoSoldado.DISPONIBLE, soldado2.getEstadoSoldado());
        assertEquals(EstadoSoldado.DISPONIBLE, soldado3.getEstadoSoldado());
        assertEquals(EstadoSoldado.DISPONIBLE, soldado4.getEstadoSoldado());
        assertEquals(EstadoSoldado.DISPONIBLE, soldado5.getEstadoSoldado());

        LOG.info("finalizando prueba testLiberarSoldad");
    }

    @Test
    @DisplayName("Test buscar soldado especialidad")
    public void testBuscarSoldadoEspecialidad() {

        Batallon batallonTest = new Batallon("1234","Octavo Brigada");
        Soldado soldado1 = new Soldado("001", "Carlos Ramírez",29,Rango.CABO,Especializacion.MEDICO,EstadoSoldado.DISPONIBLE);
        Soldado soldado2 = new Soldado("002", "Luis Torres", 32, Rango.SARGENTO, Especializacion.LOGISTICA, EstadoSoldado.NO_DISPONIBLE);
        Soldado soldado3 = new Soldado("003", "Ana Martínez", 27, Rango.SOLDADO, Especializacion.COMUNICACION, EstadoSoldado.DISPONIBLE);
        Soldado soldado4 = new Soldado("004", "José Pérez", 35, Rango.CABO, Especializacion.MEDICO, EstadoSoldado.NO_DISPONIBLE);
        Soldado soldado5 = new Soldado("005", "María Gómez", 30, Rango.SARGENTO, Especializacion.LOGISTICA, EstadoSoldado.DISPONIBLE);

        batallonTest.getListSoldados().add(soldado1);
        batallonTest.getListSoldados().add(soldado2);
        batallonTest.getListSoldados().add(soldado3);
        batallonTest.getListSoldados().add(soldado4);
        batallonTest.getListSoldados().add(soldado5);

        LinkedList<Soldado> resultado = batallonTest.buscarSoldadoEspecialidad(Especializacion.LOGISTICA);
        assertEquals(2, resultado.size(), "Deberían haber 2 soldados de LOGISTICA");
        assertTrue(resultado.contains(soldado2), "Luis Torres debería estar en los resultados");
        assertTrue(resultado.contains(soldado5), "Maria Gomez debería estar en los resultados");

        LOG.info("Finalizando testBuscarSoldadoEspecialidad");
    }

    @Test
    @DisplayName("soldados Disponibles Rango")
    public void testSoldadosDisponibleRango() {
        Batallon batallonTest = new Batallon("1234","Octavo Brigada");

        Soldado soldado1 = new Soldado("001", "Carlos Ramírez",29,Rango.CABO,Especializacion.MEDICO,EstadoSoldado.DISPONIBLE);
        Soldado soldado2 = new Soldado("002", "Luis Torres", 32, Rango.SARGENTO, Especializacion.LOGISTICA, EstadoSoldado.NO_DISPONIBLE);
        Soldado soldado3 = new Soldado("003", "Ana Martínez", 27, Rango.SOLDADO, Especializacion.COMUNICACION, EstadoSoldado.DISPONIBLE);
        Soldado soldado4 = new Soldado("004", "José Pérez", 35, Rango.CABO, Especializacion.MEDICO, EstadoSoldado.DISPONIBLE);
        Soldado soldado5 = new Soldado("005", "María Gómez", 30, Rango.SARGENTO, Especializacion.LOGISTICA, EstadoSoldado.DISPONIBLE);

        batallonTest.getListSoldados().add(soldado1);
        batallonTest.getListSoldados().add(soldado2);
        batallonTest.getListSoldados().add(soldado3);
        batallonTest.getListSoldados().add(soldado4);
        batallonTest.getListSoldados().add(soldado5);

        LinkedList<Soldado> resultado = batallonTest.soldadosDisponiblesRango(Rango.CABO);

        assertEquals(2, resultado.size());
        assertTrue(resultado.contains(soldado1));
        assertTrue(resultado.contains(soldado4));

        LOG.info("Finalizando testSoldadosDisponiblesRango");



    }
    @Test
    @DisplayName("Test calcular Edad Promedio")
    public void testCalcularEdadPromedio() {
        LOG.info("Test Calcular Promedio Edad Soldados");
        Batallon batallonTest = new Batallon("1234","Octavo Brigada");

        Soldado soldado1 = new Soldado("001", "Carlos Ramírez",29,Rango.CABO,Especializacion.MEDICO,EstadoSoldado.DISPONIBLE);
        Soldado soldado2 = new Soldado("002", "Luis Torres", 32, Rango.SARGENTO, Especializacion.LOGISTICA, EstadoSoldado.NO_DISPONIBLE);
        Soldado soldado3 = new Soldado("003", "Ana Martínez", 27, Rango.SOLDADO, Especializacion.COMUNICACION, EstadoSoldado.DISPONIBLE);
        Soldado soldado4 = new Soldado("004", "José Pérez", 35, Rango.CABO, Especializacion.MEDICO, EstadoSoldado.NO_DISPONIBLE);
        Soldado soldado5 = new Soldado("005", "María Gómez", 30, Rango.SARGENTO, Especializacion.LOGISTICA, EstadoSoldado.DISPONIBLE);

        batallonTest.getListSoldados().add(soldado1);
        batallonTest.getListSoldados().add(soldado2);
        batallonTest.getListSoldados().add(soldado3);
        batallonTest.getListSoldados().add(soldado4);
        batallonTest.getListSoldados().add(soldado5);

        double promedioEsperado = 30.6;
        double promedioObtenido = batallonTest.calcularPromedioEdadSoldado();

        assertEquals(promedioEsperado, promedioObtenido);
        LOG.info("finalizando prueba testCalcularEdadPromedio");


    }

    @Test
    @DisplayName("buscar IdSoldado")
    public void testBuscarIdSoldado() {
        LOG.info("Test buscar idsoldados");
        Batallon batallonTest = new Batallon("1234","Octavo Brigada");
        Soldado soldado1 = new Soldado("001", "Carlos Ramírez",29,Rango.CABO,Especializacion.MEDICO,EstadoSoldado.DISPONIBLE);
        Soldado soldado2 = new Soldado("002", "Luis Torres", 32, Rango.SARGENTO, Especializacion.LOGISTICA, EstadoSoldado.NO_DISPONIBLE);
        Soldado soldado3 = new Soldado("003", "Ana Martínez", 27, Rango.SOLDADO, Especializacion.COMUNICACION, EstadoSoldado.DISPONIBLE);
        Soldado soldado4 = new Soldado("004", "José Pérez", 35, Rango.CABO, Especializacion.MEDICO, EstadoSoldado.NO_DISPONIBLE);
        Soldado soldado5 = new Soldado("005", "María Gómez", 30, Rango.SARGENTO, Especializacion.LOGISTICA, EstadoSoldado.DISPONIBLE);

        batallonTest.getListSoldados().add(soldado1);
        batallonTest.getListSoldados().add(soldado2);
        batallonTest.getListSoldados().add(soldado3);
        batallonTest.getListSoldados().add(soldado4);
        batallonTest.getListSoldados().add(soldado5);

        Soldado soldadoEsperado = soldado3;
        assertEquals(soldadoEsperado, batallonTest.buscarSoldadoId("003"));

        LOG.info("finalizando prueba testBuscarIdSoldado");



    }



}