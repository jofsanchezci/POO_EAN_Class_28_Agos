
package com.ejemplo.biblioteca;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear materiales
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, 417, "978-0307474728");
        Revista revista1 = new Revista("National Geographic", "National Geographic Society", 2023, 202);

        // Agregar materiales a la biblioteca
        biblioteca.agregarMaterial(libro1);
        biblioteca.agregarMaterial(revista1);

        // Crear un usuario
        Usuario usuario1 = new Usuario("Juan Pérez", "JP123");

        // Agregar usuario a la biblioteca
        biblioteca.agregarUsuario(usuario1);

        // Prestar un libro
        usuario1.prestarMaterial(libro1);

        // Mostrar materiales prestados por el usuario
        usuario1.mostrarMaterialesPrestados();

        // Generar reporte de inventario
        biblioteca.generarReporte();
    }
}
