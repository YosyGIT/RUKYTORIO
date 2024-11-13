package estructuras;
import java.util.Scanner;
public class PPT2EJ18 {
//Haz un programa que lea 3 num y escriba el más pequeño
	public static void main(String[]args){
		Scanner entrada=new Scanner(System.in);
		int num1, num2, num3;
//Leemos los num
		System.out.println("Escriba un número enterto: ");
		num1=entrada.nextInt();
		System.out.println("Escriba un número enterto: ");
		num2=entrada.nextInt();
		System.out.println("Escriba un número enterto: ");
		num3=entrada.nextInt();
//Finaliza el proceso y sale en resultado.
		if(num1<=num2 && num1<=3)
			System.out.println("El número menor es: "+num1);
		
		entrada.close();
	}
}
