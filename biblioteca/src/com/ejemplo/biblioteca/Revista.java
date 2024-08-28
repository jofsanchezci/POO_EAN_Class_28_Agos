
package com.ejemplo.biblioteca;

public class Revista extends Material {
    private int numeroEdicion;

    public Revista(String titulo, String autor, int anioPublicacion, int numeroEdicion) {
        super(titulo, autor, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Revista: " + getTitulo() + " por " + getAutor() + " (" + getAnioPublicacion() + ")");
        System.out.println("Edición: " + numeroEdicion);
    }
}
