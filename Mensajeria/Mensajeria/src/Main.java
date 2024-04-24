import com.neoris.equipodinamita.caracteristicasvehiculo.*;
import com.neoris.equipodinamita.reportegas.ReporteCombustible;
import com.neoris.equipodinamita.transporte.*;


public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo("Ford","Chevy", "HHGL2398");
        auto.setEstanqueGasolina(new EstanqueGasolina(60));
        auto.setConductor(new Persona("Carlos", "Corona"));
        auto.setTipoVehiculo(TipoAutomovil.AUTO);
        auto.setDistanciaRecorrida(new DistanciaRecorrida(50, 10));
        ReporteCombustible.reporteCombustible(auto);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Vehiculo moto = new Vehiculo("Italika","123234", "QWD2132");
        moto.setEstanqueGasolina(new EstanqueGasolina(40));
        moto.setConductor(new Persona("Marco", "Aguirre"));
        moto.setTipoVehiculo(TipoAutomovil.MOTO);
        moto.setDistanciaRecorrida(new DistanciaRecorrida(30.50, 13.50));
        ReporteCombustible.reporteCombustible(moto);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Vehiculo moto2 = new Vehiculo("Italika", "234567", "PO34M23");
        moto2.setEstanqueGasolina(new EstanqueGasolina(30));
        moto2.setConductor(new Persona("Jose", "Corona"));
        moto2.setTipoVehiculo(TipoAutomovil.MOTO);
        moto2.setDistanciaRecorrida(new DistanciaRecorrida(30, 18.78));
        ReporteCombustible.reporteCombustible(moto2);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Vehiculo camioneta = new Vehiculo("Super camioneta", "suburban", "ASDFG45");
        camioneta.setEstanqueGasolina(new EstanqueGasolina(80));
        camioneta.setConductor(new Persona("Alejandro", "Ochoa"));
        camioneta.setTipoVehiculo(TipoAutomovil.CAMIONETA);
        camioneta.setDistanciaRecorrida(new DistanciaRecorrida(45.78, 38.9));
        ReporteCombustible.reporteCombustible(camioneta);
    }

}