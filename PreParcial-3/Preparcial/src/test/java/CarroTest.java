
import co.edu.uniquindio.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    public Carro carro;
    private Carro carro1;
    private Conductor conductor;



    @BeforeEach
    public void setUp() {
        carro = new Carro("QUW432", TipoServicio.PUBLICO, TipoCombustible.ELECTRICO);
        carro1 = new Carro("CTJ324", TipoServicio.PUBLICO, TipoCombustible.GASOLINA);
        conductor = new Conductor("Carlos", "Martinez", "1234", LocalDate.of(2004, 8, 7));
        conductor.asignarVehiculo(carro);
    }

    @Test
    void calcularPeaje() {
        assertEquals(6500, carro.calcularPeaje(), 0.01);
    }

    @Test
    void descripcionDetallada() {
        assertNotNull(carro.DescripcionDetallada());
    }
}