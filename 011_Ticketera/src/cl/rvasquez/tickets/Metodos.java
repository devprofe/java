package cl.rvasquez.tickets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Metodos {
	public static Date IngresaFechas(String dato) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd-MMM-yyyy");
		Date fecha = formato.parse(dato);
		return fecha;
	}
	
	@SuppressWarnings("deprecation")
	public static float CalculoEdad(Date fnacto) {
		Date hoy = new Date();
		float anio = hoy.getYear() - fnacto.getYear();
		float mes = (hoy.getMonth() - fnacto.getMonth())/12;
		float dia = (hoy.getDay() - fnacto.getDay())/365;
		float edad = anio + mes + dia;
		return edad;
	}
	
	public static String Admision(float edad) {
		String res;
		if(edad >= 18.00f) {
			res = "PERMITIDA SU ADMISION AL EVENTO";
		}
		else {
			res = "NO PERMITIDA SU ADMISION AL EVENTO";
		}
		return res;
	}
	
	public static String Prevencion(float edad) {
		String res;
		if(edad < 18.00f) {
			res = "NO PUEDE COMPRAR ENTRADAS";
		}
		else {
			res = "PUEDE COMPRAR ENTRADAS";
		}
		return res;
	}
	
	public static String Verificacion(boolean usado) {
		String res;
		if(usado == true) {
			res = "ya fue usada no puede pasar";
		}
		else {
			res = "puede pasar";
		}
		return res;

	}
	
	public static String StatusEvento(boolean inicia) {
		String res;
		if(inicia == false) {
			res = "no esta en Curso";
		}
		else {
			res = "en Curso";
		}
		return res;
	}
	
	public static int Cantidad(String rut, int entradas) {
		int entradasVendidas = 0;
		if(entradas != 0) {
			entradasVendidas = entradasVendidas + entradas;
		}
		return entradasVendidas;
	}
}