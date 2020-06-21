package cl.rvasquez.biblioteca;

public class Libros extends Medios{

	private int paginas;
	private String imprenta;
	
	public Libros(String codigo, String nombre, boolean reserva, int plazoMaximo, int paginas, String imprenta) {
		super(codigo, nombre, reserva, plazoMaximo);
		this.paginas = paginas;
		this.imprenta = imprenta;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getImprenta() {
		return imprenta;
	}

	public void setImprenta(String imprenta) {
		this.imprenta = imprenta;
	}

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", reserva=" + reserva + ", plazoMaximo=" + plazoMaximo
				+ ", paginas=" + paginas + ", imprenta=" + imprenta + "]";
	}
}
