package cl.rvasquez.tickets;

public class EntradasVIP extends Entradas{
	private String regalo;
	EntradasVIP(int precio, int numAsiento, boolean uso, String rutCliente, String regalo) {
		super(precio, numAsiento, uso, rutCliente);
	
		this.regalo = regalo;
	}

	public String getRegalo() {
		return regalo;
	}

	public void setRegalo(String regalo) {
		this.regalo = regalo;
	}


	
}

