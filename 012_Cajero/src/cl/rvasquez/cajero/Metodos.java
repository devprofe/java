package cl.rvasquez.cajero;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Metodos {
	public static Date IngresaFechas(String dato) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd-MMM-yyyy");
		Date fecha = formato.parse(dato);
		return fecha;
	}
	
	public static int CalculoEdad(Date fecha) {
		Date hoy = new Date();
		int edad = hoy.getYear() - fecha.getYear();
		return edad;
	}
	
	public static int RetiroDinero(int saldo, int giro) {
		int res = saldo - giro;
		return res;
	}
	
	public static int PagarDeuda(int abono, int deuda) {
		int res = deuda - abono;
		return res;
	}
	
	public static int PagarDeuda(int deudaTar) {
		int res = deudaTar = 0;
		return res;
	}
	
	public static int DeudaTarjeta(int saldod, int saldoa) {
		int res = saldod - saldoa;
		return res;
	}
}