package com.neoris.equipodinamita.transporte;

import com.neoris.equipodinamita.caracteristicasvehiculo.*;

public class Vehiculo {

    private String marca;
    private String modelo;
    private String placas;

    private TipoAutomovil tipoVehiculo;
    private Persona conductor;
    private DistanciaRecorrida distanciaRecorrida;
    private EstanqueGasolina estanqueGasolina;

    public static final double PRECIO_GASOLINA = 20.00;

    public Vehiculo(){

    }

    public Vehiculo(String marca, String modelo, String placas) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.placas = placas;
    }

    public Vehiculo(DistanciaRecorrida distanciaRecorrida, String marca, String modelo, String placas ) {
        this(marca, modelo, placas);
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public Vehiculo(DistanciaRecorrida distanciaRecorrida, Persona conductor, String marca, String modelo, String placas) {
        this(distanciaRecorrida, marca, modelo, placas);
        this.conductor = conductor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoAutomovil getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoAutomovil tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public DistanciaRecorrida getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(DistanciaRecorrida distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public EstanqueGasolina getEstanqueGasolina() {
        return estanqueGasolina;
    }

    public void setEstanqueGasolina(EstanqueGasolina estanqueGasolina) {
        this.estanqueGasolina = estanqueGasolina;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placas='" + placas + '\'' +
                ", tipoVehiculo=" + tipoVehiculo +
                ", conductor=" + conductor +
                ", distanciaRecorrida=" + distanciaRecorrida +
                ", estanqueGasolina=" + estanqueGasolina +
                '}';
    }

    public double gastoGasolina(double gasolinaLitros, double gasolinaPrecio){
        return gasolinaLitros * gasolinaPrecio;
    }
}
