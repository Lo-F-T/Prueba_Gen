package com.pruebajava.colegio_casopractico.models;

public class Alumno extends Usuario {
    private String curso;

    public Alumno(String nombre, String rut, int anioDeIngreso, String curso) {
        super(nombre, rut, anioDeIngreso);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + getNombre() + '\'' +
                ", rut='" + getRut() + '\'' +
                ", anioDeIngreso=" + getAnioDeIngreso() +
                ", curso='" + curso + '\'' +
                '}';
    }
}
