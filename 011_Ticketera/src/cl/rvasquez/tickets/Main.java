package cl.rvasquez.tickets;
import java.text.ParseException;
import java.util.ArrayList;

public class Main {
	public static void main(String[]args) throws ParseException {
		ArrayList<Entradas> lista = new ArrayList<Entradas>();
		float edad = 0;
		Eventos evento1 = new Eventos("Lollapaloozaa", 18, lista, true);
		Eventos evento2 = new Eventos("Santiago GetLouder", 18, lista, false);
		Entradas entrada1 = new Entradas(1000, 3, true,"22222222-K");
		Entradas entrada2 = new Entradas(800, 4, false,"22222222-0");
		EntradasVIP entradavip1 = new EntradasVIP(1000, 3, true,"22222222-K","Polera");
		Clientes cliente1 = new Clientes("22222222-K", "John Wick",Metodos.IngresaFechas("22-ENE-1995"));
		Clientes cliente2 = new Clientes("22222222-0", "Condor Ito",Metodos.IngresaFechas("22-ENE-2005"));		
		Vendedores vendedor1 = new Vendedores("11111111-1","Peter Parker",Metodos.IngresaFechas("10-MAY-1990"),190);
		Vendedores vendedor2 = new Vendedores("11111111-2","Erick Son",Metodos.IngresaFechas("19-JUN-1980"),300);
		lista.add(entrada1);
		lista.add(entrada2);
		
		
		System.out.println("..::INFORMACION ENTRADA 1::..");
		System.out.printf("Creando Evento (%s), Edad Minima (%d)",evento1.getNombre(),evento1.getEdadMinima());
		edad = Metodos.CalculoEdad(cliente1.getFechaNacto());
		System.out.printf("\nVerificando edad %.2f (%s), (%s)",edad,Metodos.Prevencion(edad),Metodos.Admision(edad));
		if(edad >18) {
			System.out.printf("\nVendiendo Entrada a Cliente (%s) (%s) ",cliente1.getNombre(),cliente1.getRut());
			System.out.printf("\nUsando Entrada con Cliente (%s) (%s) para Evento (%s) (%s)",cliente1.getNombre(),cliente1.getRut(),evento1.getNombre(),
								Metodos.StatusEvento(evento1.isInicioEvento()));
			System.out.printf("\nUsando entrada con cliente (%s) (%s) para evento (%s)",cliente1.getNombre(),cliente1.getRut(),evento1.getNombre());
			System.out.printf("\nEntrada para rut (%s), (%s)", cliente1.getRut(),Metodos.Verificacion(entrada1.isUso()));
			System.out.printf("\nEl evento (%s) se ha cambiado: (%s)", evento1.getNombre(),Metodos.StatusEvento(evento1.isInicioEvento()));
		}
		else {
			System.out.println("\n\nSOLO MAYORES DE 18 PUEDEN COMPRAR LA ENTRADA");
		}
		
		System.out.println("\n\n..::INFORMACION ENTRADA 2::..");
		System.out.printf("Creando Evento (%s), Edad Minima (%d)",evento2.getNombre(),evento2.getEdadMinima());
		edad = Metodos.CalculoEdad(cliente2.getFechaNacto());
		System.out.printf("\nVerificando edad %.2f (%s), (%s)",edad,Metodos.Prevencion(edad),Metodos.Admision(edad));
		if(edad >18) {
			System.out.printf("\nVendiendo Entrada a Cliente (%s) (%s) ",cliente2.getNombre(),cliente2.getRut());
			System.out.printf("\nUsando Entrada con Cliente (%s) (%s) para Evento (%s) (%s)",cliente2.getNombre(),cliente2.getRut(),evento2.getNombre(),
								Metodos.StatusEvento(evento2.isInicioEvento()));
			System.out.printf("\nUsando entrada con cliente (%s) (%s) para evento (%s)",cliente2.getNombre(),cliente2.getRut(),evento2.getNombre());
			System.out.printf("\nEntrada para rut (%s), (%s)", cliente2.getRut(),Metodos.Verificacion(entrada2.isUso()));
			System.out.printf("\nEl evento (%s) se ha cambiado: (%s)", evento2.getNombre(),Metodos.StatusEvento(evento2.isInicioEvento()));
		}
		else {
			System.out.println("\n\nSOLO MAYORES DE 18 PUEDEN COMPRAR LA ENTRADA");
		}
		System.out.println("\n\n..::VENDEDORES::..");
		System.out.printf("El vendedor (%s) ha vendido: (%d) entradas", vendedor1.getNombre(),Metodos.Cantidad(vendedor1.getRut(),vendedor1.getCantEntradasVendidas()));
		System.out.printf("\nEl vendedor (%s) ha vendido: (%d) entradas", vendedor2.getNombre(),Metodos.Cantidad(vendedor2.getRut(),vendedor2.getCantEntradasVendidas()));
	}
}
