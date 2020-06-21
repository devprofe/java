package cl.rvasquez.arreglos;
import java.util.ArrayList;
public class Visitas {
	public static void main(String[]args) {
		ArrayList<Integer> visitas = new ArrayList<Integer>();
		int x, n=args.length;
		for(x=0;x<n;x++) {
			visitas.add(Integer.parseInt(args[x]));
		}
		System.out.println("Promedio de Visitas: "+Metodos.promVisitas(visitas));
	}
}