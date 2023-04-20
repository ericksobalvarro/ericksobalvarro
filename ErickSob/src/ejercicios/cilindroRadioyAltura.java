package ejercicios;

import java.util.Scanner;

public class cilindroRadioyAltura {

	public static void main(String[] args) {
		
		Scanner tc=new Scanner(System.in);
		
		double Radio, Altura, Volumen;
		
		System.out.println("ingrese el radio del cilindro");
		Radio=tc.nextInt();
		
		System.out.println("ingrese la altura del cilindro");
		Altura=tc.nextInt();
		
		Volumen = Math.pow(Radio, 2) * Altura;
		
		System.out.println("el volumen del cilindro es: " + Volumen);
		
		
		
		

	}

}
