package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ArregloLineal {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);
	        int n, menor, mayor, posicionMenor = 0, posicionMayor = 0;
	        double suma = 0, sumaCuadrados = 0, promedio, modulo = 0;

	        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
	        n =tc.nextInt();

	        int[] arreglo = new int[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
	            arreglo[i] = tc.nextInt();
	        }

	        
	        for (int i = 0; i < n; i++) {
	            suma += arreglo[i];
	        }

	       
	        for (int i = 0; i < n; i++) {
	            sumaCuadrados += arreglo[i] * arreglo[i];
	        }

	        menor = arreglo[0];
	        for (int i = 1; i < n; i++) {
	            if (arreglo[i] < menor) {
	                menor = arreglo[i];
	                posicionMenor = i;
	            }
	        }

	       
	        mayor = arreglo[0];
	        for (int i = 1; i < n; i++) {
	            if (arreglo[i] > mayor) {
	                mayor = arreglo[i];
	                posicionMayor = i;
	            }
	        }

	        
	        promedio = suma / n;

	        
	        Arrays.sort(arreglo);

	       
	        for (int i = 0; i < n; i++) {
	            modulo += Math.abs(arreglo[i]);
	        }

	        System.out.println("La suma de los elementos del arreglo es: " + suma);
	        System.out.println("La suma de los elementos al cuadrado del arreglo es: " + sumaCuadrados);
	        System.out.println("El menor elemento del arreglo es: " + menor + " y su posición es: " + posicionMenor);
	        System.out.println("El mayor elemento del arreglo es: " + mayor + " y su posición es: " + posicionMayor);
	        System.out.println("El promedio de los elementos del arreglo es: " + promedio);
	        System.out.println("El arreglo ordenado de forma ascendente es: " + Arrays.toString(arreglo));
	        System.out.println("El módulo del arreglo es: " + modulo);

	}

}
