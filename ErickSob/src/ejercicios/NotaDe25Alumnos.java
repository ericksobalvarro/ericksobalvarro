package ejercicios;

import java.util.Scanner;

public class NotaDe25Alumnos {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
        String nombre;
        double nota1, nota2, nota3;
        double promedio;

        for (int i = 1; i <= 25; i++) {
            System.out.println("Ingrese los datos del estudiante " + i + ":");
            System.out.print("Nombre: ");
            nombre = tc.next();
            System.out.print("Nota 1: ");
            nota1 = tc.nextDouble();
            System.out.print("Nota 2: ");
            nota2 = tc.nextDouble();
            System.out.print("Nota 3: ");
            nota3 = tc.nextDouble();
            
            promedio = (nota1 + nota2 + nota3) / 3.0;
            
            System.out.println("El promedio de " + nombre + " es: " + promedio);
            System.out.println();
        }

	}

}
