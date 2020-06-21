package cl.rvasquez.archivos;
import java.util.ArrayList;
public class Metodos {
	public static float promedio(ArrayList<Integer> likes) {
		int x, l = likes.size();
		float suma = 0.0f, promedio = 0.0f;
		for (x=0;x<l;x++) {
			suma = suma + likes.get(x);
		}
		promedio = suma / l;
		return promedio;
	}
}
