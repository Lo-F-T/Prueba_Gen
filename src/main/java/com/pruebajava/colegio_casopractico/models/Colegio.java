package com.pruebajava.colegio_casopractico.models;

import java.util.ArrayList;
import java.util.List;

public class Colegio {
    private List<Curso> cursos;
    private List<Alumno> alumnos;
    private List<Profesor> profesores;

    public Colegio() {
        this.cursos = new ArrayList<>();
        this.alumnos = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void addCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void removeCurso(Curso curso) {
        this.cursos.remove(curso);
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

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void addProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }

    public void removeProfesor(Profesor profesor) {
        this.profesores.remove(profesor);
    }

}


