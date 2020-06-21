package cl.rvasquez.uml2;

import java.util.ArrayList;

public class Compras {
	private int id;
	private String nombreComprador;
	private String fechaCompra;
	private ArrayList<Productos> productos;
	private int monto;
	
	Compras(int id, String nombreComprador, String fechaCompra, ArrayList<Productos> productos, int monto){
		super();
		this.id = id;
		this.nombreComprador = nombreComprador;
		this.fechaCompra = fechaCompra;
		this.productos = productos;
		this.monto = monto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreComprador() {
		return nombreComprador;
	}

	public void setNombreComprador(String nombreComprador) {
		this.nombreComprador = nombreComprador;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public ArrayList<Productos> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Productos> productos) {
		this.productos = productos;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Compras [id=" + id + ", nombreComprador=" + nombreComprador + ", fechaCompra=" + fechaCompra
				+ ", productos=" + productos + ", monto=" + monto + "]";
	}
}