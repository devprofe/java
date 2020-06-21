package cl.rvasquez.arreglos;
import java.util.ArrayList;
public class SmartWatch {
	public static void main(String[]args) {
		ArrayList<Integer> pasos = new ArrayList<Integer>();
		int x, n=args.length;
		for(x=0;x<n;x++) {
			pasos.add(Integer.parseInt(args[x]));
		}
		System.out.println("Promedio de Pasos Filtrados: "+Metodos.crearSteps(pasos));
	}
}
