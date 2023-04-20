package ejercicios;

import java.util.Scanner;

public class FarenheitaCelcuis {

	public static void main(String[] args) {
		Scanner tc=new Scanner (System.in);
		
		System.out.println("ingrese la temperatura en grados farenheit ");
		double farenheit;
		
		farenheit=tc.nextInt();
		
		double celsuis = (5.0/9.0) * (farenheit - 32.0);
		
		System.out.println(farenheit + "grados farenhit es igual a " + celsuis + "grados celsuis.");
		
	}

}
