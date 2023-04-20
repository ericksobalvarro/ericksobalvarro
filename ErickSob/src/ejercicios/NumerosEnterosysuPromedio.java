package ejercicios;

import java.util.Scanner;

public class NumerosEnterosysuPromedio {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);
	        System.out.println("Ingrese el primer número:");
	        double numero1 = tc.nextInt();
	        System.out.println("Ingrese el segundo número:");
	        double numero2 = tc.nextInt();
	        System.out.println("Ingrese el tercer número:");
	        double numero3 = tc.nextInt();
	        
	        double suma = numero1 + numero2 + numero3;
	        double promedio = suma / 3;
	        
	        System.out.println("La suma de los tres números es: " + suma);
	        System.out.println("El promedio de los tres números es: " + promedio);
	    }
	}

	


