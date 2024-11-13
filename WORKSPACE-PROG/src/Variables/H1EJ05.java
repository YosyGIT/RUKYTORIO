package Variables;

public class H1EJ05 {
	public static void main(String[] args) {
		//Nombramos las variables
		int totalGrados= 20000;
		final int unaVuelta= 360;
		//Calculamos el número de vueltas totales
		int nVueltasTotales= totalGrados/unaVuelta;
		int gradosSobrantes= totalGrados%unaVuelta;
		//Escribimos los resultados
		System.out.println("Número de vueltas: "+ nVueltasTotales );
		System.out.println("Número de grados sobrantes= "+ gradosSobrantes);
	}
}
