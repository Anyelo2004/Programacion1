package co.edu.uniquindio;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        VehiculoBlindado v1 = new VehiculoBlindado("00","modelo4", 2324, 400.0, EstadoOperativo.DISPONIBLE, 4);
        VehiculoApoyo v2 = new VehiculoApoyo("01","modelo3",2000,5500.0,null,TipoFuncion.LOGISTICA);
        VehiculoTransporteTropa v3 = new VehiculoTransporteTropa("02","modelo2",2011,6000.0,null,50);
        VehiculoApoyo v4 = new VehiculoApoyo("03","model1",2001,1500.0,null,TipoFuncion.MEDICO);
        Mision mision = new Mision("0000", LocalDate.now().plusDays(1),"En la casa de Sergio");
        v1.getListMisiones().add(mision);
        Batallon b1 = new Batallon("Elbata", "01");
        b1.getListVehiculos().add(v1);
        b1.getListVehiculos().add(v2);
        b1.getListVehiculos().add(v3);
        b1.getListVehiculos().add(v4);
        //era  listo el pollo,jejejje 4 carros, uno libre uno mision y los otros con el kilometraje alto cual metodo, sip, ahora el otro metodo batallon
        System.out.println(b1.actualizarEstadoVehiculo());
        //for (int i = 1; i <= 5; i++) {
            //System.out.println("i = " + i);
        //}
    }
}