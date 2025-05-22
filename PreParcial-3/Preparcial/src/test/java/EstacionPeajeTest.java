import co.edu.uniquindio.Camion;
import co.edu.uniquindio.Conductor;
import co.edu.uniquindio.EstacionPeaje;
import co.edu.uniquindio.Recaudador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EstacionPeajeTest {
    EstacionPeaje EstacionPeaje;
    Conductor conductor;
    Conductor conductor2;
    Camion camion;
    Camion camion2;
    Camion camion3;
    Recaudador cobrador;


    @BeforeEach
    void setUp() {
        EstacionPeaje = new EstacionPeaje("Medellin", "Antioquia");
        conductor = new Conductor("CARLOS ANDRÉS", "RAMÍREZ", "987654321", LocalDate.of(1985, 7, 22));
        conductor2 = new Conductor("DIEGO", "FERNÁNDEZ", "5678", LocalDate.of(1992, 5, 3));
        camion = new Camion("ABC123", 5, 14);
        camion2 = new Camion("DEF456", 6, 9);
        camion3 = new Camion("GHI789", 4, 11);

        conductor2.asignarVehiculo(camion3);
        conductor.asignarVehiculo(camion);
        conductor.asignarVehiculo(camion2);
        conductor.asignarVehiculo(camion3);

        EstacionPeaje.getListaConductores().add(conductor);
        EstacionPeaje.getListaConductores().add(conductor2);
    }

    @Test
    void imprimirVehiculos() {
        assertNotNull(EstacionPeaje);
    }

    @Test
    void buscarCobrador() {
        cobrador = new Recaudador("pedro", "radamel", "1032156", LocalDate.of(2006, 12, 24), 50000);
        EstacionPeaje.getRecaudadoresPeajes().add(cobrador);
        assertNotNull(EstacionPeaje.buscarRecaudador("pedro", "radamel"));
    }

    @Test
    void identificarConductoresConCamionesMayoresA10Toneladas() {
        List<Conductor> resultado = EstacionPeaje.conductoresConCamionMayor10Toneladas();
        assertEquals(2, resultado.size());
    }
}
