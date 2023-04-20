package ejercicios;

import java.util.Scanner;

public class Nnumerosdistintosde0 {

	public static void main(String[] args) {
		  Scanner tc = new Scanner(System.in);
	        int num;
	        int sumaPositivos = 0;
	        int conteoNegativos = 0;

	        System.out.print("Ingrese el número de números distintos de cero: ");
	        num =tc.nextInt();

	        for (int i = 1; i <= num; i++) {
	            System.out.print("Ingrese el número " + i + ": ");
	            int numero = tc.nextInt();
	            
	            if (numero > 0) {
	                sumaPositivos += numero;
	            } else if (numero < 0) {
	                conteoNegativos++;
	            }
	        }

	        System.out.println("La suma de los números positivos es: " + sumaPositivos);
	        System.out.println("El número de números negativos es: " + conteoNegativos);

	}

}
