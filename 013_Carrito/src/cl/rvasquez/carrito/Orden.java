package cl.rvasquez.carrito;

import java.util.ArrayList;

public class Orden {
	private String direccionDespacho;
	private String nombreCliente;
	private ArrayList<String> codigos;
	private double montoTotal;
	private String fechaCompra;
	
	Orden(String direccionDespacho, String nombreCliente, ArrayList<String> codigos, double montoTotal, String fechaCompra){
		this.direccionDespacho = direccionDespacho;
		this.nombreCliente = nombreCliente;
		this.codigos = codigos;
		this.montoTotal = montoTotal;
		this.fechaCompra = fechaCompra;
		
	}

	public String getDireccionDespacho() {
		return direccionDespacho;
	}

	public void setDireccionDespacho(String direccionDespacho) {
		this.direccionDespacho = direccionDespacho;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public ArrayList<String> getCodigos() {
		return codigos;
	}

	public void setCodigos(ArrayList<String> codigos) {
		this.codigos = codigos;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	@Override
	public String toString() {
		return direccionDespacho+","+nombreCliente+","+codigos+","+montoTotal+","+fechaCompra;
	}	
}
