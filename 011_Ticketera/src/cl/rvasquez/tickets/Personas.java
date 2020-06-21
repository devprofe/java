package cl.rvasquez.tickets;
import java.util.Date;

public class Personas {
	private String rut;
	private String nombre;
	private Date fechaNacto;
	
	Personas(String rut, String nombre, Date fechaNacto){
		this.rut = rut;
		this.nombre = nombre;
		this.fechaNacto = fechaNacto;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacto() {
		return fechaNacto;
	}

	public void setFechaNacto(Date fechaNacto) {
		this.fechaNacto = fechaNacto;
	}
	
}
