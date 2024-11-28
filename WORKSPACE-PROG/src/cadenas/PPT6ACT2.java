package cadenas;
import java.util.Scanner;
public class PPT6ACT2 {
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escribe el mensaje en el que desee observar las vocales: ");
		String cadena = entrada.nextLine();
		int i, cont=0;
		
		
		//contamos las vocales
		for (char c : cadena.toLowerCase().toCharArray()) {
			if("aeiou".indexOf(c) != -1) {
				cont++;
			}
		}
		System.out.println("Número de vocales: " + cont);
	}
}
