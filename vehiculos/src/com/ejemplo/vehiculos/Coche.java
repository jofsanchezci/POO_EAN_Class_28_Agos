
package com.ejemplo.vehiculos;

public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Coche: " + getMarca() + " " + getModelo() + " (" + getAnio() + "), Puertas: " + numeroPuertas);
    }
}
