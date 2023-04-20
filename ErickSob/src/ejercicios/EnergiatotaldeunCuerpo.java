package ejercicios;

import java.util.Scanner;

public class EnergiatotaldeunCuerpo {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);
	      
	      System.out.print("Ingrese la masa del cuerpo en kilogramos: ");
	      double masa = tc.nextInt();
	      
	      System.out.print("Ingrese la velocidad del cuerpo en metros por segundo: ");
	      double velocidad = tc.nextInt();
	      
	      System.out.print("Ingrese la altura del cuerpo en metros: ");
	      double altura = tc.nextInt();
	      
	      final double G = 9.81;
	      
	      double energiaCinetica = 0.5 * masa * velocidad * velocidad;
	      double energiaPotencial = masa * altura * G;
	      double energiaTotal = energiaCinetica + energiaPotencial;
	      
	      System.out.println("La energía cinética del cuerpo es " + energiaCinetica + " j");
	      System.out.println("La energía potencial del cuerpo es " + energiaPotencial + " j");
	      System.out.println("La energía total del cuerpo es " + energiaTotal + " j");

	}

}
