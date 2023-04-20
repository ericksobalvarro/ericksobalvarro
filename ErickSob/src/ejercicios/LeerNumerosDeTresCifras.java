package ejercicios;

import java.util.Scanner;

public class LeerNumerosDeTresCifras {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);
	      
	      System.out.print("Ingrese un número de tres cifras: ");
	      int numero = tc.nextInt();
	      
	      int cifra1 = numero / 100;
	      int cifra2 = (numero % 100) / 10;
	      int cifra3 = numero % 10;
	      
	      int numeroInvertido = cifra3 * 100 + cifra2 * 10 + cifra1;
	      
	      System.out.println("El número invertido es: " + numeroInvertido);

	}

}
