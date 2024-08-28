
package com.ejemplo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Reportable {
    private List<Material> materiales;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.materiales = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarMaterial(Material material) {
        materiales.add(material);
        System.out.println("Material añadido al inventario: " + material.getTitulo());
    }

    public void eliminarMaterial(Material material) {
        materiales.remove(material);
        System.out.println("Material eliminado del inventario: " + material.getTitulo());
    }

    public Material buscarMaterial(String titulo) {
        for (Material material : materiales) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                return material;
            }
        }
        System.out.println("Material no encontrado.");
        return null;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario añadido: " + usuario.getNombre());
    }

    public Usuario buscarUsuario(String idUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario().equals(idUsuario)) {
                return usuario;
            }
        }
        System.out.println("Usuario no encontrado.");
        return null;
    }

    @Override
    public void generarReporte() {
        System.out.println("Reporte de Inventario:");
        for (Material material : materiales) {
            material.mostrarDetalles();
            System.out.println("Disponible: " + material.isDisponible());
        }
    }
}
