package vectores;
import java.util.Scanner;
public class Hvec1EJ1 {
	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		int[] num= new int[4];
		System.out.println("Escribe cuatro números enteros: ");
		for(int i=0;i<4;i++)
			num[i]=entrada.nextInt();
			System.out.println("Estos son los números guardados: ");
			System.out.println(" "+num[0]);
			System.out.println(" "+num[1]);
			System.out.println(" "+num[2]);
			System.out.println(" "+num[3]);	
	}
}
