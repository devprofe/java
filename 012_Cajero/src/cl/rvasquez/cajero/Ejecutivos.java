package cl.rvasquez.cajero;

public class Ejecutivos extends Personas{
	private String nombreSucursal;
	private String telefonoSucursal;
	private String direccionSucursal;

	Ejecutivos(String rut, String nombre, String telefono, String email, String nombreSucursal, String telefonoSucursal, String direccionSucursal) {
		super(rut, nombre, telefono, email);
		this.nombreSucursal = nombreSucursal;
		this.telefonoSucursal = telefonoSucursal;
		this.direccionSucursal = direccionSucursal;
	}

	public String getNombreSucursal() {
		return nombreSucursal;
	}

	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}

	public String getTelefonoSucursal() {
		return telefonoSucursal;
	}

	public void setTelefonoSucursal(String telefonoSucursal) {
		this.telefonoSucursal = telefonoSucursal;
	}

	public String getDireccionSucursal() {
		return direccionSucursal;
	}

	public void setDireccionSucursal(String direccionSucursal) {
		this.direccionSucursal = direccionSucursal;
	}
	

}
