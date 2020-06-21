package cl.rvasquez.cajero;

public class Personas {
	private String rut;
	private String nombre;
	private String telefono;
	private String email;
	
	Personas(String rut, String nombre, String telefono, String email){
		this.rut = rut;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Personas [rut=" + rut + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + "]";
	}
}
