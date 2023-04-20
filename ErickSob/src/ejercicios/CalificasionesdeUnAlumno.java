package ejercicios;

import java.util.Scanner;

public class CalificasionesdeUnAlumno {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

	    System.out.print("Ingrese la calificación del alumno: ");
	    double calificacion = tc.nextInt();

	    if (calificacion >= 60) {
	      System.out.println("Aprobado");
	    } else {
	      System.out.println("Reprobado");
	    }

	   
	  }
	}

	


