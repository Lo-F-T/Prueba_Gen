package com.pruebajava.colegio_casopractico.models;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Materia {
    public int codigo;
    private String nombre;
    private List<Alumno> alumnos;
    private HashMap<String, ArrayList<Double>> notas;

    public Materia(String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
        this.notas = new HashMap<>();
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void addAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public void removeAlumno(Alumno alumno) {
        this.alumnos.remove(alumno);
    }


    public HashMap<String, ArrayList<Double>> getNotas() {
        return notas;
    }
    
    public void setNotas(HashMap<String, ArrayList<Double>> notas) {
        this.notas = notas;
    }

    public Materia(HashMap<String, ArrayList<Double>> notas) {
        this.notas = notas;
    }

    public void agregarNota(Alumno alumno, double nota) {
        if (alumnos.contains(alumno)) {
            String rut = alumno.getRut();
            if (!notas.containsKey(rut)) {
                notas.put(rut, new ArrayList<Double>());
            }
            notas.get(rut).add(nota);
        }
    }

    public double promedioMateria() {
        double sum = 0.0;
        int count = 0;
        for (String rut : notas.keySet()) {
            for (Double nota : notas.get(rut)) {
                sum += nota;
                count++;
            }
        }
        return sum / count;
    }

    public double promedioAlumno(Alumno alumno) {
        double sum = 0.0;
        int count = 0;
        String rut = alumno.getRut();
        if (notas.containsKey(rut)) {
            for (Double nota : notas.get(rut)) {
                sum += nota;
                count++;
            }
            return sum / count;
        }
        return 0.0;
    }

    /*public void verNotas() {
        for (Alumno alumno : alumnos) {
            double[] notasArr = notas;
            double sum = 0;
            double max = notasArr[0];
            double min = notasArr[0];
            for (int i = 0; i < notasArr.length; i++) {
                sum += notasArr[i];
                if (notasArr[i] > max) {
                    max = notasArr[i];
                }
                if (notasArr[i] < min) {
                    min = notasArr[i];
                }
            }
            double avg = sum / notasArr.length;
            System.out.println("Notas de " + alumno.getNombre() + " en " + nombre);
            System.out.println("Nota más alta: " + max);
            System.out.println("Nota más baja: " + min);
            System.out.println("Promedio: " + avg);
        }
    }*/
/* 
    public double promedioCurso(Curso curso) {
        double sum = 0.0;
        int count = 0;
        for (Alumno alumno : curso.getAlumnos()) {
            String rut = alumno.getRut();
            if (notas.containsKey(rut)) {
                for (Double nota : notas.get(rut)) {
                    sum += nota;
                    count++;
                }
            }
        }
        return sum / count;
    }*/




}
