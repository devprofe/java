package cl.rvasquez.coleccion1;

public class Persona {
	

	private String nombre;
	private String correo;
	private String ciudad;
	private int monto;
	
	public Persona( String nombre, String correo, String ciudad, int monto) {

		this.nombre = nombre;
		this.correo = correo;
		this.ciudad = ciudad;
		this.monto = monto;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Persona [ nombre=" + nombre + ", correo=" + correo + ", ciudad=" + ciudad + ", monto="
				+ monto + "]";
	}
	
	

}

