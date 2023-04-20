package ejercicios;

import java.util.Scanner;

public class NumerosPareseImpare {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);
	        System.out.println("Ingrese la cantidad de números a leer:");
	        int cantidad = tc.nextInt();
	        int[] numeros = new int[cantidad];
	        
	        int pares = 0;
	        int impares = 0;
	        for (int i = 0; i < cantidad; i++) {
	            System.out.println("Ingrese el número #" + (i+1) + ":");
	            numeros[i] = tc.nextInt();
	            if (numeros[i] % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }
	        
	        System.out.println("La cantidad de números pares es: " + pares);
	        System.out.println("La cantidad de números impares es: " + impares);

	}

}
