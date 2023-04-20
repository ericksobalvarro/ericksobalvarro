package ejercicios;

public class ArrayPosicionesImpares {

	public static void main(String[] args) {
		 int[] numeros = new int[20];

	        
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = i + 1;
	        }

	        
	        System.out.println("Elementos en posiciones impares:");
	        for (int i = 1; i < numeros.length; i += 2) {
	            System.out.println(numeros[i]);
	        }

	}

}
