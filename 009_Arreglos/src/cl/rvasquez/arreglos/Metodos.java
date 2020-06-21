package cl.rvasquez.arreglos;
import java.util.ArrayList;
public class Metodos {
	public static int promVisitas(ArrayList<Integer> visitas){
		int x, l = visitas.size(), suma = 0, promedio = 0;
		for(x=0;x<l;x++) {
			suma = suma + visitas.get(x);
		}
		promedio = suma / l;
		return promedio;
	}
	public static int crearSteps(ArrayList<Integer> pasos){
		int x, l = pasos.size(), c = 0, suma = 0, promedio = 0;
		for(x=0;x<l;x++) {
			if(pasos.get(x)>200 && pasos.get(x)<1000000) {	
				suma = suma + pasos.get(x); 
				c++;
			}
		}
		promedio = suma / c ;
		return promedio;
	}
	
	public static ArrayList<Integer> filtro(ArrayList<Integer> nums){
		ArrayList<Integer> filtrado = new ArrayList<Integer>();
		int x, l = nums.size();
		for(x=0;x<l;x++) {
			if(nums.get(x) % 3 == 0) {
				filtrado.add(nums.get(x));
			}
		}
		return filtrado;
	}
	public static int suma(ArrayList<Integer> nums) {
		int x, l = nums.size(), suma = 0;
		for(x=0;x<l;x++) {
			suma = suma + nums.get(x);
		}
		return suma;
	}
	public static float promedio(ArrayList<Integer> nums) {
		int x, l = nums.size();
		float suma = 0.0f, promedio = 0.0f;
		for(x=0;x<l;x++) {
			suma = suma + nums.get(x);
		}
		promedio = suma / l;
		return promedio;
	}
}