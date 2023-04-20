package ejercicios;

import java.util.Scanner;

public class SumaDesusDigitos {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);

	        System.out.print("Ingresa un número entero: ");
	        int numero = tc.nextInt();

	        int suma = 0;

	        while (numero != 0) {
	            suma += numero % 10;
	            numero /= 10;
	        }

	        System.out.println("La suma de los dígitos es: " + suma);

	}

}
