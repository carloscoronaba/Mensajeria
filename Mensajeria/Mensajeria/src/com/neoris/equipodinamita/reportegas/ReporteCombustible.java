package com.neoris.equipodinamita.reportegas;

import com.neoris.equipodinamita.transporte.Vehiculo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ReporteCombustible {

    private static int id;
    private static int ultimoId;

    static Date fecha = new Date();
    static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", new Locale("es", "ES"));
    static String fechaFormateada = formato.format(fecha);

    public static void reporteCombustible(Vehiculo vehiculo){

        System.out.println("===============");
        System.out.println("Fecha: " + fechaFormateada);
        System.out.println("Id Reporte: " + ++id);
        System.out.println("Conductor: " + vehiculo.getConductor());
        System.out.println("Placas: " + vehiculo.getPlacas());
        System.out.println("Unidad: " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " con capacidad maxima de "
                + vehiculo.getTipoVehiculo().getNumeroPaquetes() + " paquetes");
        System.out.println("Capacidad máxima de gasolina: " + vehiculo.getEstanqueGasolina().getCapacidad());
        System.out.println("Km recorridos: " + vehiculo.getDistanciaRecorrida().getDitanciaKM() + " km");
        System.out.println("Listros gastados: " + vehiculo.getDistanciaRecorrida().getGasolinaGastada() + " LT");
        System.out.println("Total costo de gasolina: " +
                vehiculo.gastoGasolina( vehiculo.getDistanciaRecorrida().getGasolinaGastada(), Vehiculo.PRECIO_GASOLINA) + "$");
    }
}
