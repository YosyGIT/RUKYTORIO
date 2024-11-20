package vectores;

import java.util.Scanner;

public class PPT3EJbusqueda {
	public static void main(String[] args) {
		int v[] = {9,8,6,5,4};
		int valor;
		int pos;
		boolean encontrado = false;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce valor a buscar: ");
		valor = entrada.nextInt();
		
		for(pos=0;pos<v.length;pos++)
			if(v[pos]==valor) {
				encontrado = true;
				pos = v.length; 
				System.out.println("Está en la oposición: "+pos);
			}
	}
}
