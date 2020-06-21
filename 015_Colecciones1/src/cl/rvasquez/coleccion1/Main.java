package cl.rvasquez.coleccion1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<Persona> individuo = new ArrayList<Persona>();
		individuo = (ArrayList<Persona>) loadCSV();
		obtenerDatos(individuo);
	}

	private static ArrayList<Persona> obtenerDatos(ArrayList<Persona> individuo) {
		
			ArrayList<Persona> buscarPersona = new ArrayList<Persona>();
			ArrayList<String> buscarCiudad = new ArrayList<String>();
			List<String> lista = new ArrayList<>();
			
						
			int c1=0;
			int c2=0;
			
			for(Persona persona : individuo) {
				if(persona.getNombre().contains("Giselle Marshall")) {
					
					lista.add(persona.getNombre());
					lista.add(persona.getCorreo());
					lista.add(persona.getCiudad());
					lista.add(String.valueOf(persona.getMonto()));
										
					buscarPersona.add(persona);
					break;
				}
			}
			
			System.out.println("Se deben obtener los datos de \"Giselle Marshall\" e imprimirlos en pantalla");
			System.out.println("******************************************************************");
			System.out.println("Nombre : " + lista.get(0));
			System.out.println("Correo : " + lista.get(1));
			System.out.println("Ciudad : " + lista.get(2));
			System.out.println("Monto : " + lista.get(3));
			System.out.println("");
		
			
			for(Persona persona : individuo) {
				if(persona.getCorreo().contains("imperdiet.non@enim.org")) {
					
					lista.add(persona.getNombre());
					lista.add(persona.getCorreo());
					lista.add(persona.getCiudad());
					lista.add(String.valueOf(persona.getMonto()));
					buscarPersona.add(persona);
					break;
				}
			}
			
			System.out.println("Se deben obtener los datos para el correo \"imperdiet.non@enim.org");
			System.out.println("******************************************************************");
			System.out.println("Nombre : " + lista.get(4));
			System.out.println("Correo : " + lista.get(5));
			System.out.println("Ciudad : " + lista.get(6));
			System.out.println("Monto : " + lista.get(7));
			System.out.println("");
			
			for(Persona persona : individuo) {
				buscarCiudad.add(persona.getCiudad());
			}
			 
			System.out.println("Almacenar en una estructura de datos todos las ciudades para evitar repetidos e imprimirla cantidad.");
			System.out.println("******************************************************************");
			System.out.println("La cantidad de Ciudades es: " + buscarCiudad.size() + "," + c2);
			System.out.println("");
			
			System.out.println("Se deben contar todos los correos que posean en alguna parte de su dominio la palabra \"elite\"");
			System.out.println("******************************************************************");
			System.out.println("La cantidad de correo con la palabra (elite) es: " + individuo.stream().filter(fil -> fil.getCorreo().contains("elit")).count());
			System.out.println("");
		    
			
			System.out.println("Se deben multiplicar por 3 todos los montos en la colección, e imprimir los mayores a 29000 ");
			System.out.println("******************************************************************");
			individuo.stream().map(cal -> cal.getMonto()*3).filter(a -> a>29000).forEach(System.out::println);
			System.out.println("");
		
			
		    System.out.println("Calcular el promedio de todos los montos: " + individuo.stream().mapToDouble(Persona::getMonto).sum()/individuo.size());
			System.out.println("******************************************************************");
		    System.out.println("");
		    
		    
		    System.out.println("Obtener los datos de la persona con el monto mayor");
			System.out.println("******************************************************************");
		    Persona p1 = individuo.stream().max(Comparator.comparingInt(Persona::getMonto)).get();
		    System.out.println("Nombre : " + p1.getNombre() + "\n" + "Correo: " + p1.getCorreo() + "\n" + "Ciudad : " + p1.getCiudad()+ "\n" + "Monto: " + p1.getMonto());
		    System.out.println("");
		    
		    System.out.println("Obtener los datos de la persona con el monto menor");
			System.out.println("******************************************************************");
		    Persona p2 = individuo.stream().min(Comparator.comparingInt(Persona::getMonto)).get();
		    System.out.println("Nombre : " + p2.getNombre() + "\n" + "Correo: " + p2.getCorreo() + "\n" + "Ciudad : " + p2.getCiudad()+ "\n" + "Monto: " + p2.getMonto());
		    System.out.println("");
		    
			return buscarPersona;
	
		}

		private static List<Persona> loadCSV() throws IOException{
			
			BufferedReader br = new BufferedReader(new FileReader("datos.csv"));
			 return br.lines().map(line -> line.split(","))
			 .map(values -> new Persona(values[0], values[1], values[2],
			Integer.parseInt(values[3])))
			 .collect(Collectors.toList());
		}
}