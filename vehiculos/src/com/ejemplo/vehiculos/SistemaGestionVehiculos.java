
package com.ejemplo.vehiculos;

public class SistemaGestionVehiculos {
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche("Toyota", "Corolla", 2020, 4);
        Vehiculo miMoto = new Moto("Honda", "CB500X", 2021, false);
        CocheDeportivo miCocheDeportivo = new CocheDeportivo("Ferrari", "488 GTB", 2022, 2, 330);

        miCoche.mostrarDetalles();
        miMoto.mostrarDetalles();
        miCocheDeportivo.mostrarDetalles();

        miCocheDeportivo.conducir();
    }
}
