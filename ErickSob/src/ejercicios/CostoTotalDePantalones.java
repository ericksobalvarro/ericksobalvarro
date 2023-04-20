package ejercicios;

import java.util.Scanner;

public class CostoTotalDePantalones {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);

	        System.out.print("Ingrese la cantidad de pantalones comprados: ");
	        int cantidadPantalones = tc.nextInt();

	        double costoTotal;
	        if (cantidadPantalones > 3) {
	            costoTotal = cantidadPantalones * 10;
	        } else {
	            costoTotal = cantidadPantalones * 12;
	        }

	        System.out.println("El costo total de la compra es: $" + costoTotal);

	       
	    }
	}




