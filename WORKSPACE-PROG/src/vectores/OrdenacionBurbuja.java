package vectores;

public class OrdenacionBurbuja {
	public static void main (String[]args) {
		int v[]= {6,2,9,12,4,1,87};
		int i,j;
		int aux=0;
		System.out.println("Array inicial: ");
		for (i=0;i<v.length;i++)
			System.out.println(v[i]+" ");
		//bucle externo
		for (i=1;i<v.length;i++) {
			//Bucle interno para comparar parejas
			for(j=1;j<v.length;j++)
				if(v[j-1]>v[j])
					aux=v[j-1];
					v[j]=aux;
		}
	}
}
