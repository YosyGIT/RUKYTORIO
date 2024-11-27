package vectores;

public class Hvec1EJ9 {
	public static void main(String[] args) {
		final int TAMAÑO = 8;
		int m[][] = new int[TAMAÑO][TAMAÑO];
		int i, j;

		// Llenar la matriz unitaria
		for (i = 0; i < TAMAÑO; i++) {
			for (j = 0; j < TAMAÑO; j++) {
				if (i == j) {
					m[i][j] = 1; // Elemento en la diagonal principal
				} else {
					m[i][j] = 0; // Elementos fuera de la diagonal
				}
			}
		}

		// Imprimir la matriz
		for (i = 0; i < TAMAÑO; i++) {
			for (j = 0; j < TAMAÑO; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println(); // Nueva línea después de cada fila
		}
	}
}