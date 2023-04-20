package ejercicios;

import java.util.Scanner;

public class ArreglosLinealesAyB {

	public static void main(String[] args) {
		 Scanner tc = new Scanner(System.in);
	        int N = 3;  
	        int[] A = new int[N];
	        int[] B = new int[N];
	        
	       
	        System.out.println("Ingrese los elementos del arreglo A:");
	        for (int i = 0; i < N; i++) {
	            A[i] =tc.nextInt();
	        }
	        System.out.println("Ingrese los elementos del arreglo B:");
	        for (int i = 0; i < N; i++) {
	            B[i] = tc.nextInt();
	        }
	        
	        
	        int producto_punto = 0;
	        for (int i = 0; i < N; i++) {
	            producto_punto += A[i] * B[i];
	        }
	        System.out.println("El producto punto es: " + producto_punto);
	        
	        
	        if (producto_punto == 0) {
	            System.out.println("Los arreglos son ortogonales.");
	        } else {
	            System.out.println("Los arreglos no son ortogonales.");
	        }
	        
	        
	        int modulo_A = 0;
	        int modulo_B = 0;
	        for (int i = 0; i < N; i++) {
	            modulo_A += A[i] * A[i];
	            modulo_B += B[i] * B[i];
	        }
	        double Z = (double)producto_punto / (Math.sqrt(modulo_A) * Math.sqrt(modulo_B));
	        System.out.println("La expresión Z es: " + Z);

	}

}
