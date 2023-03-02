package com.pruebajava.colegio_casopractico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.pruebajava.colegio_casopractico.models.Profesor;
import com.pruebajava.colegio_casopractico.models.Alumno;
import com.pruebajava.colegio_casopractico.models.Colegio;
import com.pruebajava.colegio_casopractico.models.Curso;
import com.pruebajava.colegio_casopractico.models.Materia;


//



@SpringBootApplication

public class ColegioCasopracticoApplication {
	
	static ArrayList<Materia> materias = new ArrayList<Materia>();
	static HashMap<Integer, ArrayList<String>> materiasPorCurso = new HashMap<Integer, ArrayList<String>>();
	static Colegio colegio = new Colegio();


	private static void ingresarMateriasPorCurso(Scanner scanner) {
		System.out.println("Ingrese rango del Curso (1ro Basico-4to Medio):");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese codigo unico del Curso:");
		int codigo = scanner.nextInt();
        System.out.println("Ingrese materias para cada curso (separadas por comas):");
        System.out.println("Materias para " + nombre + ":");
        String materiasStr = scanner.nextLine();
        String[] materiasArray = materiasStr.split(",");

		
        Curso curso = new Curso(nombre, materiasArray);
        System.out.println("Materias ingresadas por curso: " + materiasPorCurso.toString());
    }

    // se ingresan profesores al Sistema
	private static void ingresarProfesor(Scanner scanner) {
		System.out.println("Ingrese datos de profesor:");
		System.out.println("Nombre:");
		String nombre = scanner.nextLine();
		System.out.println("RUT:");
		String rut = scanner.nextLine();
		System.out.println("Año de ingreso:");
		int añoIngreso = scanner.nextInt();
		scanner.nextLine();
		Profesor profesor = new Profesor(nombre, rut, añoIngreso);
		colegio.addProfesor(profesor);
		System.out.println("Profesor ingresado: " + profesor.toString());
	}
	
	// se ingresan Alumnos al sistema
	private static void ingresarAlumno(Scanner scanner) {
        System.out.println("Ingrese datos de alumno:");
        System.out.println("Nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Curso:");
        String curso = scanner.nextLine();
		System.out.println("RUT:");
    	String rut = scanner.nextLine();
    	System.out.println("Año de ingreso:");
    	int añoIngreso = scanner.nextInt();
		scanner.nextLine();
    	Alumno alumno = new Alumno(nombre, rut, añoIngreso, curso);
    	colegio.addAlumno(alumno);
    	System.out.println("Alumno ingresado: " + alumno.toString());
	}

	private static void ingresarNotasDeAlumno(Scanner scanner){
		System.out.println("Ingrese codigo de la materia;");

	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ingresar Cursos y materias");
            System.out.println("2. Matricular alumno");
            System.out.println("3. Contratar profesor");
            System.out.println("4. Ingresar Notas de Alumno");
            System.out.println("5. Promedio");
            System.out.println("6. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
					ingresarMateriasPorCurso(scanner);
                    break;
                case 2:
					ingresarAlumno(scanner);
                    break;
                case 3:
					ingresarProfesor(scanner);
                    break;
                case 4:
                    ingresarProfesor(scanner);
                    break;
                case 5:
					ingresarNotasDeAlumno(scanner);
                    break;
                case 6:
                    ;
                    break;
                case 0:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

}