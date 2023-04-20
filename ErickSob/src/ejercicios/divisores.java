package ejercicios;

import java.util.Scanner;

public class divisores {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);
	        System.out.print("Ingrese un número entero: ");
	        int numero = tc.nextInt();
	        System.out.print("Los divisores de " + numero + " son: ");

	        for (int i = 1; i <= numero; i++) {
	            if (numero % i == 0) {
	                System.out.print(i + " ");
	            }
	        }
	        

	}

}
