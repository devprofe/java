package cl.rvasquez.uml2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Vendedores> vendedor1 = new ArrayList<>();
		vendedor1.add(new Vendedores ("v001", "Juan Perez", "juan@perez.cl", false, "Jper.2020"));
		System.out.println(vendedor1);
	}
}