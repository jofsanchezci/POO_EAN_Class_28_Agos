
package com.ejemplo.vehiculos;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean getTieneSidecar() {
        return tieneSidecar;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Moto: " + getMarca() + " " + getModelo() + " (" + getAnio() + "), Sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}
