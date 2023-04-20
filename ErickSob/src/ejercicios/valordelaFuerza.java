package ejercicios;

import java.util.Scanner;

public class valordelaFuerza {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		
		double Masa,Aceleracion, Valor;
		
		System.out.println("ngrese la masa del cuerpo");
		Masa=tc.nextInt();
		
		System.out.println("ngrese la aceeracion del cuerpo");
		Aceleracion=tc.nextInt();
		
		Valor = Masa * Aceleracion;
		
		System.out.println("el valor del cuerpo es: " + Valor);
		
		
		

	}

}
