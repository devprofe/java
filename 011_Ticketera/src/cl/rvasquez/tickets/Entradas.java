package cl.rvasquez.tickets;

public class Entradas {
	private int precio;
	private int numAsiento;
	private String rutCliente;
	private boolean uso;
	
	Entradas(int precio, int numAsiento, boolean uso, String rutCliente){
		this.precio = precio;
		this.numAsiento = numAsiento;
		this.rutCliente = rutCliente;
		this.uso = uso;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getNumAsiento() {
		return numAsiento;
	}

	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public boolean isUso() {
		return uso;
	}

	public void setUso(boolean uso) {
		this.uso = uso;
	}	
}
