package cl.rvasquez.tickets;
import java.util.Date;

public class Vendedores extends Personas{
	private int cantEntradasVendidas;
	
	Vendedores(String rut, String nombre, Date fechaNacto, int cantEntradasVendidas) {
		super(rut, nombre, fechaNacto);
		this.cantEntradasVendidas = cantEntradasVendidas;
		
	}

	public int getCantEntradasVendidas() {
		return cantEntradasVendidas;
	}

	public void setCantEntradasVendidas(int cantEntradasVendidas) {
		this.cantEntradasVendidas = cantEntradasVendidas;
	}
	
	
}
