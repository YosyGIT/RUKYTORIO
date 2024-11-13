package bucles;
//programa que lea enteros hasta introducir un 0 e imprima la media de todos
import java.util.Scanner;
public class PPT2EJ23 {
	public static void main (String [] args) {
		//Entrada. Leer entero
		int num;
		double media=0.0;
		int cont=0;
		Scanner entrada =new Scanner(System.in);
		
		//bucle principal 
		while(cont<10) {
			System.out.println("Introduce un entero: ");
			num=entrada.nextInt();
			cont++;  //equivale a cont=cont+1
		}
		//proceso
		if(cont==0.0) 
			media=media/cont; //media=media(double)cont;
		
		//salida
		System.out.println("La medida de los números es: "+ media);
		
	}
}
