package cl.rvasquez.uml2;

public class Usuarios {
	private String id;
	private String nombre;
	private String correo;
	private boolean esAdmin;
	private String password;
	
	Usuarios(String id, String nombre, String correo, boolean esAdmin, String password){
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.esAdmin = esAdmin;
		this.password = password;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public boolean isEsAdmin() {
		return esAdmin;
	}

	public void setEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", esAdmin=" + esAdmin
				+ ", password=" + password + "]";
	}	
	
}
