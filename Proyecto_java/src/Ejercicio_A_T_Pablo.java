
// Mi proyecto java

public class Ejercicio_A_T_Pablo {

	public static void main(String[] args) {
		
		int numbsV =20;
		int[] vector=new int[numbsV];
		
		//rellenamos con números aleatorios entre 4-43
		rellenarVector(vector);
		
		//mostrar el vector
		mostrarVector(vector);
		
		//informe
		System.out.println("INFORME******");
		System.out.println("Media: "+mediaVector(vector));
		System.out.println("Superiores a media: "+supMedia(vector));
		System.out.println("Inferiores a media: "+infMedia(vector));
		System.out.println("Iguales a media: "+igualesMedia(vector));

	}
	//con números de 4-43 
	public static void rellenarVector(int[] v) {
		for(int i=0; i<v.length; i++) {
			v[i] =(int) (Math.random()*40+4);
		}
	}
	//3::5::6::35::2
	public static void mostrarVector(int[] v) {
		String msj="";
	
		/* Sin substring
		for(int i=0; i<v.length-1; i++) {
			System.out.print(v[i]+"::");
		}
		System.out.println(v[v.length-1]);
		*/
		for(int i=0; i<v.length; i++) {
			msj=msj+v[i]+"::";
		}
		System.out.println(msj.substring(0,msj.length()-2));
	}
	public static float mediaVector(int[] v) {
		float media=0;
		
		
	for (int i=0; i<v.length; i++) {
			media+=v[i];
		}
		media=media/v.length;
		return media;
	}
	public static int supMedia(int[] v) {
		int contador=0;
		float media=mediaVector(v);
		for (int i=0; i<v.length; i++) {
			if(v[i]>media) {
			contador++;
			}
		}
		return contador;
	}
	public static int infMedia(int[] v) {
		int contador=0;
		float media=mediaVector(v);
		for (int i=0; i<v.length; i++) {
			if(v[i]<media) {
			contador++;
			}
		}
		return contador;
	}
	public static int igualesMedia(int[] v) {
		int contador=0;
		float media=mediaVector(v);
		for (int i=0; i<v.length; i++) {
			if(v[i]==media) {
			contador+=1;
			}
		}
		return contador;
	}
}