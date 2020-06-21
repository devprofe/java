package cl.rvasquez.carrito;

public class Pantalones extends Articulos{
	
	private String color;
	private int bolsillos;

	Pantalones(String codigo, String nombre, String marca, int talla, String color, int bolsillos, double precio) {
		super(codigo, nombre, marca, talla, precio);
		this.color = color;
		this.bolsillos = bolsillos;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBolsillos() {
		return bolsillos;
	}

	public void setBolsillos(int bolsillos) {
		this.bolsillos = bolsillos;
	}
	@Override
	public String toString() {
		return super.toString() + " bolsillos= "+bolsillos+" color="+color;
	}
}
