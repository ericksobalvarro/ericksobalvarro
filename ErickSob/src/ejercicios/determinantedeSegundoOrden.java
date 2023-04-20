package ejercicios;

import java.util.Scanner;

public class determinantedeSegundoOrden {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

        double a, b, c, d, determinante;

        System.out.print("Ingrese el valor de a: ");
        a =tc.nextInt();

        System.out.print("Ingrese el valor de b: ");
        b =tc.nextInt();

        System.out.print("Ingrese el valor de c: ");
        c = tc.nextInt();

        System.out.print("Ingrese el valor de d: ");
        d = tc.nextInt();

       
        determinante = a * d - b * c;

        System.out.println("El determinante de la matriz de segundo orden es: " + determinante);
	}

}
