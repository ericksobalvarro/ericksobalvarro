package ejercicios;

import java.util.Scanner;

public class LeeNumerosEnteros {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);
	        System.out.println("Ingrese la cantidad de números enteros a leer:");
	        int cantidad = tc.nextInt();
	        int[] numeros = new int[cantidad];
	        
	        for (int i = 0; i < cantidad; i++) {
	            System.out.println("Ingrese el número entero #" + (i+1) + ":");
	            numeros[i] = tc.nextInt();
	        }
	        
	        System.out.println("Los números ingresados son:");
	        for (int i = 0; i < cantidad; i++) {
	            System.out.println(numeros[i]);
	        }
	}

}
