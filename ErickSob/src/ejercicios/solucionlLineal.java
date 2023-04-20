package ejercicios;

import java.util.Scanner;

public class solucionlLineal {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
        double a, b, solucion;
        

        System.out.print("Ingrese el valor de a: ");
        a =tc.nextInt();

        System.out.print("Ingrese el valor de b: ");
        b =tc.nextInt();
        
        solucion = -b / a;
        
        System.out.println("La solución lineal de la ecuación " + a + "x + " + b + " = 0 es: " + solucion);
        

	}

}
