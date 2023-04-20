package ejercicios;

public class ArregloBidimensional {

	public static void main(String[] args) {
		int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] B = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		int[][] suma = new int[A.length][A[0].length]; 
		
		for (int i = 0; i < A.length; i++) {
		    for (int j = 0; j < A[0].length; j++) {
		        suma[i][j] = A[i][j] + B[i][j];
		    }
		}

		
		for (int i = 0; i < suma.length; i++) {
		    for (int j = 0; j < suma[0].length; j++) {
		        System.out.print(suma[i][j] + " ");
		    }
		    System.out.println();
		}
	}}


