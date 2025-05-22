import co.edu.uniquindio.Conductor;
import co.edu.uniquindio.Moto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {
    public Moto moto;
    public Conductor conductor;

    @BeforeEach
    public void setUp() {
        conductor = new Conductor("ANDREA", "SALAZAR", "9988776655", LocalDate.of(1998, 11, 25));
        moto = new Moto("MOTO456", 300);
        conductor.asignarVehiculo(moto);
    }

    @Test
    void calcularPeaje() {
        assertEquals(5000.0, moto.calcularPeaje());
    }

    @Test
    void descripcionDetallada() {
        assertNotNull(moto.DescripcionDetallada());
    }
}
