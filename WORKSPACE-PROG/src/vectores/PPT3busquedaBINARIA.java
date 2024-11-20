package vectores;

import java.util.Scanner;

public class PPT3busquedaBINARIA {
	public static void main(String[] args) {
		int v[] = { 2, 4, 5, 7, 15, 22, 31 };
		int valor;
		Scanner teclado = new Scanner(System.in);
		int ini = 0, fin = v.length - 1, me = 0;

		// pedimos el valor a buscar
		System.out.println("Valor a buscar: ");
		valor = teclado.nextInt();
		for (int i = 0; i < v.length; i++)
			System.out.println("");
		do {
			// calcular mitad
			me = (ini + fin) / 2;
			// nos quedamos con la mitad correspondiente
			if (v[me] > valor)
				ini = me - 1;
			else
				ini = me + 1;
//			if(v[me]==valor)
//				encontrado=true;
//		}While(ini<=fin && encontrado==false);
		} while (ini <= fin);
		System.out.println("Valor en posición: ");
	}
}
