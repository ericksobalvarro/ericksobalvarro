package ejercicios;

import java.util.Scanner;

public class convertidorYardasPiesPulgadasaCentimero {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);
	        double yardas, pies, pulgadas, centimetros;
	        
	        System.out.print("Ingrese la cantidad de yardas: ");
	        yardas =tc.nextInt();
	        
	        System.out.print("Ingrese la cantidad de pies: ");
	       pies =tc.nextInt();
	        
	       System.out.print("Ingrese la cantidad de pulgadas: ");
	        pulgadas =tc.nextInt();
	        
	        centimetros = yardas * 91.44 + pies * 30.48 + pulgadas * 2.54;
	        
	        System.out.println(yardas + " yardas, " + pies + " pies y " + pulgadas + " pulgadas son " + centimetros + " centímetros");
	        
	        
		

	}

}
