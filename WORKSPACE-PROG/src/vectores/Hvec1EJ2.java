package vectores;
import java.util.Scanner;
public class Hvec1EJ2 {
	public static void main(String[]args) {
		//Introducimos el número de datos que vamos a introducir
		Scanner entrada= new Scanner(System.in);
		System.out.println("Escribe el número de datos que introduciras: ");
		int n;
		n= entrada.nextInt();
		//Creamos un nuevo escaner para guardar los numeor sintroducidos en el vector
		Scanner numeros= new Scanner(System.in);
		int[] v= new int [n];
		System.out.println("Escribe " +n+ " números");
		
		for(int i=0;i<n;i++)
			v[i]=numeros.nextInt();
		for(int x=1;x<=n;x++)
			System.out.println(v[n-x]+"");
	}
}
