package com.pruebajava.colegio_casopractico.models;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Usuario {
    private List<String> materiasEnsenadas;

    public Profesor(String nombre, String rut, int anioDeIngreso) {
        super(nombre, rut, anioDeIngreso);
        this.materiasEnsenadas = new ArrayList<>();
    }

    public List<String> getMateriasEnsenadas() {
        return materiasEnsenadas;
    }

    public void setMateriasEnsenadas(List<String> materiasEnsenadas) {
        this.materiasEnsenadas = materiasEnsenadas;
    }

    public void addMateriaEnsenada(String materiaEnsenada) {
        this.materiasEnsenadas.add(materiaEnsenada);
    }

    public void removeMateriaEnsenada(String materiaEnsenada) {
        this.materiasEnsenadas.remove(materiaEnsenada);
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + getNombre() + '\'' +
                ", rut='" + getRut() + '\'' +
                ", anioDeIngreso=" + getAnioDeIngreso() +
                ", materiasEnsenadas=" + materiasEnsenadas +
                '}';
    }
}