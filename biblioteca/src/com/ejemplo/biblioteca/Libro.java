
package com.ejemplo.biblioteca;

public class Libro extends Material {
    private int numeroPaginas;
    private String isbn;

    public Libro(String titulo, String autor, int anioPublicacion, int numeroPaginas, String isbn) {
        super(titulo, autor, anioPublicacion);
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Libro: " + getTitulo() + " por " + getAutor() + " (" + getAnioPublicacion() + ")");
        System.out.println("Páginas: " + numeroPaginas + ", ISBN: " + isbn);
    }
}
