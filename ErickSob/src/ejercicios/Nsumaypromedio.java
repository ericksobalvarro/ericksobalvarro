package ejercicios;

import java.util.Scanner;

public class Nsumaypromedio {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);
	        System.out.println("Ingrese la cantidad de números a leer:");
	        int cantidad = tc.nextInt();
	        double[] numeros = new double[cantidad];
	        
	        double suma = 0;
	        for (int i = 0; i < cantidad; i++) {
	            System.out.println("Ingrese el número #" + (i+1) + ":");
	            numeros[i] = tc.nextDouble();
	            suma += numeros[i];
	        }
	        
	        double promedio = suma / cantidad;
	        
	        System.out.println("La suma de los " + cantidad + " números es: " + suma);
	        System.out.println("El promedio de los " + cantidad + " números es: " + promedio);

	}

}
