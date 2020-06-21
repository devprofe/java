package cl.rvasquez.cajero;

public class CuentasCorrientes extends Productos{

	private int deudaMensual;
	private int abono;
	
	CuentasCorrientes(int saldoDisponible, String nroProducto, int deudaMensual, int abono) {
		super(saldoDisponible, nroProducto);
		this.deudaMensual = 15000;
		this.abono = abono;
		
	}
	public int getDeudaMensual() {
		return deudaMensual;
	}
	public void setDeudaMensual(int deudaMensual) {
		this.deudaMensual = deudaMensual;
	}
	public int getAbono() {
		return abono;
	}
	public void setAbono(int abono) {
		this.abono = abono;
	}
	
}
