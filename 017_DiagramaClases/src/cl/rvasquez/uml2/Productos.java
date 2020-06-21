package cl.rvasquez.uml2;

public class Productos {
	private String id;
	private String nombre;
	private String descripcion;
	private int cantidad;
	private boolean status;
	private String categoria;
	
	Productos(String id, String nombre, String descripcion, int cantidad, boolean status, String categoria){
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.status = status;
		this.categoria = categoria;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", cantidad=" + cantidad
				+ ", status=" + status + ", categoria=" + categoria + "]";
	}
}
