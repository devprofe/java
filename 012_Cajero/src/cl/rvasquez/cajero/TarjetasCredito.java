package cl.rvasquez.cajero;

public class TarjetasCredito extends Productos{

	private int saldoAdeudado;
	private int cupoMaximo;
	private int deudaTotal;
	
	TarjetasCredito(int saldoDisponible, String nroProducto, int saldoAdeudado, int cupoMaximo, int deudaTotal) {
		super(saldoDisponible, nroProducto);
		
		this.saldoAdeudado = saldoAdeudado;
		this.cupoMaximo = cupoMaximo;
		this.deudaTotal = deudaTotal;
	}

	public int getSaldoAdeudado() {
		return saldoAdeudado;
	}

	public void setSaldoAdeudado(int saldoAdeudado) {
		this.saldoAdeudado = saldoAdeudado;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}

	public int getDeudaTotal() {
		return deudaTotal;
	}

	public void setDeudaTotal(int deudaTotal) {
		this.deudaTotal = deudaTotal;
	}
	

}
