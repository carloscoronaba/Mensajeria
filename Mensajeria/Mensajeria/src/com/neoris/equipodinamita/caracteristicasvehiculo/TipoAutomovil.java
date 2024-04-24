package com.neoris.equipodinamita.caracteristicasvehiculo;

public enum TipoAutomovil {
    MOTO("Motocicleta", 10),
    AUTO("Automovil",  15),
    CAMIONETA("Camioneta", 30);

    private final String nombre;
    private final int numeroPaquetes;

    TipoAutomovil(String nombre, int numeroPaquetes) {
        this.nombre = nombre;
        this.numeroPaquetes = numeroPaquetes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPaquetes() {
        return numeroPaquetes;
    }

}
