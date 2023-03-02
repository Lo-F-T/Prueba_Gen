package com.pruebajava.colegio_casopractico.models;

public class Usuario {
    private String nombre;
    private String rut;
    private int anioDeIngreso;

    public Usuario(String nombre, String rut, int anioDeIngreso) {
        this.nombre = nombre;
        this.rut = rut;
        this.anioDeIngreso = anioDeIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public void setAnioDeIngreso(int anioDeIngreso) {
        this.anioDeIngreso = anioDeIngreso;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", anioDeIngreso=" + anioDeIngreso +
                '}';
    }
}