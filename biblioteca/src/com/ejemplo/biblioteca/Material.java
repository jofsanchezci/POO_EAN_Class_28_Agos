
package com.ejemplo.biblioteca;

public abstract class Material {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    public Material(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El material ha sido prestado.");
        } else {
            System.out.println("El material no está disponible.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("El material ha sido devuelto.");
    }

    public abstract void mostrarDetalles();
}
