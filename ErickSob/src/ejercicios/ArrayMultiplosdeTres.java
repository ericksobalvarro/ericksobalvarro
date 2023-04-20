package ejercicios;

public class ArrayMultiplosdeTres {

	public static void main(String[] args) {
		int[] numeros = new int[20];

        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        
        System.out.println("Elementos que contienen múltiplos de 3:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 3 == 0) {
                System.out.println(numeros[i]);
            }
        }

	}

}
