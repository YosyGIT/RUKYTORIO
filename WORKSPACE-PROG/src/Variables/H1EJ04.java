package Variables;

public class H1EJ04 {
	public static void main(String[] args) {
		//Añadir variable x
		int x= 5;
		//Calculo de la operación
		int suma= 3+x; //Sumamos 3 a X
		double cuadradoSuma = Math.pow(suma, 2); //Elevamos al cuadrado la suma de 3+X
		double cuboX= Math.pow(x,  3);//Elevamos al cubo X
		double div1= cuboX/cuadradoSuma;//Dividimos la suma al cuadrado entre X al cubo
		double mulX= 9*x;//Multiplicamos 9 por X 
		double div2= 1/mulX;//Dividimos 1 entre 9 por X
		double muldiv2= 5*div2;//Multiplicamos la división del parenteis
		double resul= div1+muldiv2;//Y realizamos el resultado final sumando div1+multdiv2
		//Escribimos el resultado
		System.out.println("Resultado final es:  " + resul);
	}

}
