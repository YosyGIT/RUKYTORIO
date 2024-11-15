package vectores;

import java.util.Scanner;

public class Hvec1EJ7 {
	public static void main(String[] args) {
		//creamos el escaner para pedir las notas
		Scanner entrada = new Scanner(System.in);
		int[] notas = new int[8];//vector que indica 8 notas
		System.out.print("Introduce 8 notas: ");
		
		//validamos la nota
		for (int i = 0; i < 8; i++) {
			notas[i] = entrada.nextInt();
			if (notas[i] < 0 || notas[i] > 10) {
				System.out.println("Introduce una nota entre 0 y 10.");
				i--;
			}
		}
		//ordanamos de mayor a menor las notas
		System.out.println("Notas ordenadas de mayor a menor: ");
		for (int i = 0; i < 8; i++) {
			int max = -1; //ponemos el contador de la máxima nota en -1 para que el rango sea entre 0 y 10
			for (int j = 0; j < 8; j++) {
				if (notas[j] > max) {
					max = notas[j];
				}
			}
			if (max > 0) {
				System.out.println(max);
				for (int k = 0; k < 8; k++) {
					if (notas[k] == max) {//se compara la nota para ver si es repetida o no
						notas[k] = -1;
					}
				}
			}
		}
	}
}
