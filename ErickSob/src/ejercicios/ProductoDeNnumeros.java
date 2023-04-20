package ejercicios;

import java.util.Scanner;

public class ProductoDeNnumeros {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);
	        int num;
	        int producto = 1;

	        System.out.print("Ingrese el número de números a multiplicar: ");
	        num = tc.nextInt();

	        for (int i = 1; i <= num; i++) {
	            System.out.print("Ingrese el número " + i + ": ");
	            int numero = tc.nextInt();
	            producto *= numero;
	        }

	        System.out.println("El producto de los " + num + " números es: " + producto);

	}

}
