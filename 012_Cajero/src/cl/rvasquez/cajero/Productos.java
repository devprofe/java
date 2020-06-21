package cl.rvasquez.cajero;

public class Productos {
	private int saldoDisponible;
	private String nroProducto;
	
	Productos(int saldoDisponible, String nroProducto){
		this.saldoDisponible = saldoDisponible;
		this.nroProducto = nroProducto;
	}

	public int getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(int saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public String getNroProducto() {
		return nroProducto;
	}

	public void setNroProducto(String nroProducto) {
		this.nroProducto = nroProducto;
	}
	
	
}
