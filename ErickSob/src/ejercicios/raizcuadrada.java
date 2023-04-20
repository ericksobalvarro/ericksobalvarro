package ejercicios;

import java.util.Scanner;

public class raizcuadrada {

	public static void main(String[] args) {
		
		double num;
		
		Scanner tc= new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		
	  num=tc.nextInt();
	  
	  double raiz = Math.sqrt(num);
	  
	  System.out.println("la raiz cuadrada de " + num + " es " + raiz);
	  
		
		

	}

}
