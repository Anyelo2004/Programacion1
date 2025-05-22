import co.edu.uniquindio.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ConductorTest {


    public Conductor conductor;
    public Camion camion;
    public Moto moto;
    public Carro carro;

    @BeforeEach
    public void setUp() {
        conductor = new Conductor("Carlos", "Mejía", "321", LocalDate.of(1988, 3, 12));
        camion = new Camion ("HLV123",4,11);
        moto = new Moto("12efr",200);
        carro = new Carro("AAAA23", TipoServicio.PUBLICO, TipoCombustible.ELECTRICO);
        conductor.asignarVehiculo(camion);
        conductor.asignarVehiculo(moto);
        conductor.asignarVehiculo(carro);

    }

    @Test
    public void testobtenerVehiculosPorTipo() {
        Vehiculo carro = new Carro("ETR213", TipoServicio.PARTICULAR, TipoCombustible.ELECTRICO);
        carro.setNumeroPeajesPagados(3);

        Vehiculo moto = new Moto("CTR321", 150);
        moto.setNumeroPeajesPagados(2);

        conductor.asignarVehiculo(carro);
        conductor.asignarVehiculo(moto);



        assertEquals(34000,conductor.TotalPagadoEnPeajes());
    }
    @Test
    public void testTotalPagadoEnPeajes(){
        assertNotNull(conductor.TotalPagadoEnPeajes());


    }


}