package bucles;
import java.util.Scanner;
public class PPT2EJ25 {
	public static void main (String[]args) {
		int num;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un número: ");
		num=entrada.nextInt();
		
		//bucle
		if (num%2!=1)
			System.out.println("Has introducido un número par " + num);
		else {
			while(num%2==1) {
				System.out.println("Has introducido un número impar: "+num);
				System.out.println("Introduce otro número: ");
				num=entrada.nextInt();
			}
			if (num%2!=1)
				System.out.println("Has un número par " + num);
		}
	}
}
