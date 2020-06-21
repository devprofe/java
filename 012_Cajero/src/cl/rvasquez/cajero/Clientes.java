package cl.rvasquez.cajero;
import java.util.Date;
public class Clientes extends Personas{
	private int clave;
	private Date fechaNacto;
	
	Clientes(String rut, String nombre, String telefono, String email, int clave, Date fechaNacto) {
		super(rut, nombre, telefono, email);
		this.clave = clave;
		this.fechaNacto = fechaNacto;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public Date getFechaNacto() {
		return fechaNacto;
	}

	public void setFechaNacto(Date fechaNacto) {
		this.fechaNacto = fechaNacto;
	}
	

}
