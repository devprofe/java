package cl.rvasquez.carrito;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class LectorConfiguracion {
	public static String formatoSalida() throws IOException{
		return buscarConfiguracion("formatoSalida");
	}
	
	public static String rutaExportacion() throws IOException{
		return buscarConfiguracion("rutaSalida");
	}

	private static String buscarConfiguracion(String configuracion) throws IOException{
		BufferedReader reader = Files.newBufferedReader(Paths.get("configuracion.txt"));
		
		String linea;
		while ((linea = reader.readLine()) != null) {
			if(linea.contains(configuracion)) {
				return (linea.substring(linea.indexOf("=")+1, linea.indexOf(";")));
			}
		}
		throw new IOException("No se pudo encontrar el archivo configuracion.txt en la carpeta del modulo", new Throwable("Archivo de configuraciones no encontrado"));
		
	}
}
