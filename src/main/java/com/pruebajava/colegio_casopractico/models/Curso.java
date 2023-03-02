package com.pruebajava.colegio_casopractico.models;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Materia> materias;

    public Curso(String nombre, List<String> materias) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public void addMateria(Materia materia) {
        this.materias.add(materia);
    }

    public void removeMateria(Materia materia) {
        this.materias.remove(materia);
    }
}
