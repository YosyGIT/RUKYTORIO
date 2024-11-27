package vectores;

import java.util.Scanner;

public class Hvec1EJ12 {
	public static void main(String[] args) {
        final int FILAS = 5, COLUMNAS = 3;
        int notas[][] = new int[FILAS][COLUMNAS];

        Scanner teclado = new Scanner(System.in);
        int i, j, nota;

        // Bucle para insertar las notas
        for (i = 0; i < FILAS; i++) {
            for (j = 0; j < COLUMNAS; j++) {
                do {
                    System.out.println("Inserte nota del alumno " + (i + 1) + " para el módulo " + (j + 1) + " (>0): ");
                    nota = teclado.nextInt();
                } while (nota <= 0);
                notas[i][j] = nota;
            }
        }

        // Bucle para imprimir las notas
        System.out.println("Notas ingresadas:");
        for (i = 0; i < FILAS; i++) {
            for (j = 0; j < COLUMNAS; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }

        teclado.close(); // Cerrar el Scanner
    }
}