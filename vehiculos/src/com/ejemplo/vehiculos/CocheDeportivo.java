
package com.ejemplo.vehiculos;

public class CocheDeportivo extends Coche implements Conducible {
    private int velocidadMaxima;

    public CocheDeportivo(String marca, String modelo, int anio, int numeroPuertas, int velocidadMaxima) {
        super(marca, modelo, anio, numeroPuertas); // Aquí se pasa el parámetro extra 'numeroPuertas'
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo un coche deportivo a alta velocidad!");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}
