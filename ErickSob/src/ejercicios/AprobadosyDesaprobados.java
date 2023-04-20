package ejercicios;

import java.util.Scanner;

public class AprobadosyDesaprobados {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
        int numAlumnos;
        int aprobados = 0;
        int desaprobados = 0;

        System.out.print("Ingrese el número de alumnos: ");
        numAlumnos = tc.nextInt();

        for (int i = 1; i <= numAlumnos; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            int nota = tc.nextInt();

            if (nota >= 60) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        System.out.println("El número de aprobados es: " + aprobados);
        System.out.println("El número de desaprobados es: " + desaprobados);	

	}

}
