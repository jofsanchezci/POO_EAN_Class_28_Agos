
package com.ejemplo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String idUsuario;
    private List<Material> materialesPrestados;

    public Usuario(String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.materialesPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void prestarMaterial(Material material) {
        if (material.isDisponible()) {
            material.prestar();
            materialesPrestados.add(material);
        } else {
            System.out.println("El material ya está prestado.");
        }
    }

    public void devolverMaterial(Material material) {
        if (materialesPrestados.remove(material)) {
            material.devolver();
        } else {
            System.out.println("Este material no fue prestado por este usuario.");
        }
    }

    public void mostrarMaterialesPrestados() {
        System.out.println("Materiales prestados por " + nombre + ":");
        for (Material material : materialesPrestados) {
            material.mostrarDetalles();
        }
    }
}
