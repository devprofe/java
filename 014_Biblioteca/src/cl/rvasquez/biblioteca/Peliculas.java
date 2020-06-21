package cl.rvasquez.biblioteca;

public class Peliculas extends Medios{

	private int duracion;
	private String calidad;
	
	public Peliculas(String codigo, String nombre, boolean reserva, int plazoMaximo, int duracion, String calidad) {
		super(codigo, nombre, reserva, plazoMaximo);
		this.calidad = calidad;
		this.duracion = duracion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", reserva=" + reserva + ", plazoMaximo=" + plazoMaximo
				+ ", duracion=" + duracion + ", calidad=" + calidad + "]";
	}
}
