package cl.rvasquez.carrito;

public class Articulos {
	

	private String codigo;
	private String nombre;
	private String marca;
	private int talla;
	private double precio;
	
	Articulos(String codigo, String nombre, String marca, int talla, double precio){
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.talla = talla;
		this.precio = precio;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulos [codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", talla=" + talla
				+ ", precio=" + precio + "]";
	}
	
}
