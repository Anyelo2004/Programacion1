import co.edu.uniquindio.Camion;
import co.edu.uniquindio.Conductor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class CamionTest {
    public Camion camion;
    public Conductor conductor;

    @BeforeEach
    public void setUp() {
        conductor = new Conductor("MARIA FERNANDA", "GOMEZ", "1122334455", LocalDate.of(1990, 8, 15));
        camion = new Camion("XYZ-789", 4, 20);
        conductor.asignarVehiculo(camion);
    }

    @Test
    void calcularCostoPeaje() {
        assertEquals(92400.0, camion.calcularPeaje());
    }

    @Test
    void descripcionDetallada() {
        assertNotNull(camion.DescripcionDetallada());
    }
}
