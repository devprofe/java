package cl.rvasquez.biblioteca;

public class Medios {
	protected String codigo;
	protected String nombre;
	protected boolean reserva;
	protected int plazoMaximo;
	
	public Medios(String codigo, String nombre, boolean reserva, int plazoMaximo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.reserva = reserva;
		this.plazoMaximo = plazoMaximo;
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

	public boolean isReserva() {
		return reserva;
	}

	public void setReserva(boolean reserva) {
		this.reserva = reserva;
	}

	public int getPlazoMaximo() {
		return plazoMaximo;
	}

	public void setPlazoMaximo(int plazoMaximo) {
		this.plazoMaximo = plazoMaximo;
	}

	@Override
	public String toString() {
		return "Medios [codigo=" + codigo + ", nombre=" + nombre + ", reserva=" + reserva + ", plazoMaximo="
				+ plazoMaximo + "]";
	}
}
