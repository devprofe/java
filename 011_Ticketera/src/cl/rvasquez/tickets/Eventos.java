package cl.rvasquez.tickets;
import java.util.ArrayList;

public class Eventos {
	private String nombre;
	private int edadMinima;
	private ArrayList<Entradas> listaEntradas;
	private boolean inicioEvento;
	
	Eventos(String nombre, int edadMinima, ArrayList<Entradas> listaEntradas, boolean inicioEvento){
		this.nombre = nombre;
		this.edadMinima = edadMinima;
		this.listaEntradas = listaEntradas;
		this.inicioEvento = inicioEvento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public ArrayList<Entradas> getListaEntradas() {
		return listaEntradas;
	}

	public void setListaEntradas(ArrayList<Entradas> listaEntradas) {
		this.listaEntradas = listaEntradas;
	}

	public boolean isInicioEvento() {
		return inicioEvento;
	}

	public void setInicioEvento(boolean inicioEvento) {
		this.inicioEvento = inicioEvento;
	}
}
