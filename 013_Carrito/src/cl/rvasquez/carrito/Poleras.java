package cl.rvasquez.carrito;

public class Poleras extends Articulos{

	private String color;
	Poleras(String codigo, String nombre,  String marca, int talla, String color, double precio) {
		super(codigo, nombre, marca, talla, precio);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return super.toString() + " color= "+color;
	}
}
