package ejercicios;

import java.util.Scanner;

public class calcularCapital {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);

		    System.out.print("Ingrese el capital prestado: ");
		    double capital = tc.nextInt();

		    double tasa;
		    if (capital > 1000) {
		      tasa = 0.07;
		    } else {
		      tasa = 0.06;
		    }

		    double interes = capital * tasa;
		    System.out.println("El capital prestado es $" + capital + " y su interés es $" + interes);

		   
		  }
		}

	


