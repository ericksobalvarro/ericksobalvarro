package ejercicios;

import java.util.Scanner;

public class promedioNotas {

	public static void main(String[] args) {
		
		Scanner tc=new Scanner(System.in);
		int CantidadNotas;
		double sumaNotas = 0, promedio;
		
		System.out.println("ingrese la cantidad de notas: ");
		CantidadNotas =tc.nextInt();
		
		for (int i = 1; i <= CantidadNotas; i++) {
			System.out.println("ingrese la nota " + i + ": ");
			double nota =tc.nextInt();
			sumaNotas += nota;
			
		}
		promedio = sumaNotas / CantidadNotas;
		
		System.out.println("el promedio de las notas es: " + promedio);
		
		
		

		
		
		

	}

}
 