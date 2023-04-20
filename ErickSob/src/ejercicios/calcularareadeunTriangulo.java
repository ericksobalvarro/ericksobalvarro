package ejercicios;

import java.util.Scanner;

public class calcularareadeunTriangulo {

	public static void main(String[] args) {
		
		Scanner tc=new Scanner(System.in);
		
		double lado1, lado2, lado3, semiperimetro, area;
		
		System.out.println("ingrese el primer lado del triangulo:  ");
		lado1 =tc.nextInt();
		
		System.out.println("ingrese el segundo lado del triangulo:  ");
		lado2 =tc.nextInt();
		
		System.out.println("ingrese el tercer lado del triangulo:  ");
		lado3 =tc.nextInt();
		
		semiperimetro = (lado1 + lado2 + lado3) /2;
		
		area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
		System.out.println("el area del triangulo es: " + area);
		
		
		
		
		
	}

}
