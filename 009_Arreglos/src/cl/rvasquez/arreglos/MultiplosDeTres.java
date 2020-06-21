package cl.rvasquez.arreglos;
import java.util.ArrayList;
public class MultiplosDeTres {
	public static void main(String[]args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int x, n=args.length;
		for(x=0;x<n;x++) {
			numeros.add(Integer.parseInt(args[x]));
		}
		System.out.print("Arreglo Filtrado: "+Metodos.filtro(numeros));
		System.out.print("\nLa Suma del Filtro es: "+Metodos.suma(Metodos.filtro(numeros)));
		System.out.print("\nEl Promedio del Filtro es: "+Metodos.promedio(Metodos.filtro(numeros)));
	}
}