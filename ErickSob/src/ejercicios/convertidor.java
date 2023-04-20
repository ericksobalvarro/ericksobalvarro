package ejercicios;

import java.util.Scanner;

public class convertidor {

	public static void main(String[] args) {
		Scanner tc= new Scanner (System.in);
		
		System.out.println("ingrese el peso en kilogramo");
		double kilos;
		
		kilos=tc.nextInt();
		
		double libras = kilos * 2.20462;
		
		System.out.println(kilos + "kilogramos es igual a " + libras + "libras");

	}

}
