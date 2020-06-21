package cl.rvasquez.carrito;

import java.util.List;

public class Metodos {
	public static double carrito(List<Double> precios) {
		double suma = 0;
		int x, l = precios.size();
		for(x = 0; x<l ; x++) {
			suma = suma + precios.get(x);
		}
		return suma;
	}

}
