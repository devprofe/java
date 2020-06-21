package cl.rvasquez.carrito;

public class Zapatos extends Articulos{
	
	private String modelo;
	Zapatos(String codigo, String nombre,  String marca, String modelo, int talla, double precio) {
		super(codigo, nombre, marca, talla, precio);
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return super.toString() + " modelo= "+modelo;
	}
}
