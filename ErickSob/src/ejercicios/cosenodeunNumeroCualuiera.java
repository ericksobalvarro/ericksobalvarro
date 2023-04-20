package ejercicios;

import java.util.Scanner;

public class cosenodeunNumeroCualuiera {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		double Numero, Coseno;
		
		System.out.println("ingrese un numero para obtener su coceno");
		Numero=tc.nextInt();
		
		double Radianes =Math.toRadians(Numero);
		
		Coseno = Math.cos(Radianes);
		
		System.out.println("el coseno de " + Numero + " es: " + Coseno);
		



	}

}
