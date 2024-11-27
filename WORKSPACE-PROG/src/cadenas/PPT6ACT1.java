package cadenas;

public class PPT6ACT1 {
	public static void main(String[] args) {
		  // Cadena de caracteres
        String mensaje = "Ruky uky tuky";
        int i;

        // Usamos un bucle for para recorrer cada carácter de la cadena
        for (i = 0; i < mensaje.length(); i++) {
            // Obtener el carácter en la posición i
            char c = mensaje.charAt(i);

            // Imprimir el carácter
            System.out.print(c);
        }
    }
}