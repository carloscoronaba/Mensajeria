package com.neoris.equipodinamita.caracteristicasvehiculo;

public class DistanciaRecorrida {
    private double ditanciaKM;
    private double gasolinaGastada;

    public DistanciaRecorrida(double ditanciaKM, double gasolinaGastada) {
        this.ditanciaKM = ditanciaKM;
        this.gasolinaGastada = gasolinaGastada;
    }

    public double getDitanciaKM() {
        return ditanciaKM;
    }

    public void setDitanciaKM(double ditanciaKM) {
        this.ditanciaKM = ditanciaKM;
    }

    public double getGasolinaGastada() {
        return gasolinaGastada;
    }

    public void setGasolinaGastada(double gasolinaGastada) {
        this.gasolinaGastada = gasolinaGastada;
    }


}
