package cl.rvasquez.archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[]args) {
		String archivo = "/Users/rvasquez/eclipse-workspace/010_Archivos/src/cl/rvasquez/archivos/likes";
		FileReader fr = null;
		BufferedReader br = null;
		String data = "";
		int x, f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0, f6 = 0, f7 = 0, f8 = 0, f9 = 0 ;
		ArrayList<String> fotos = new ArrayList<String>();
		ArrayList<Integer> frecuencias = new ArrayList<Integer>();
		List<String> pase = null;
		List<String> filtro = null;
		List<String> resultados = null;
		
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			data = br.readLine();
			while(data != null) {
				pase = Arrays.asList(data.split(" "));
				fotos.addAll(pase);
				data = br.readLine();
			}
			br.close();
			fr.close();
		}
		catch (Exception e) {
			System.out.println("ERROR : "+e);
		}
		
		resultados = fotos.stream().filter(linea -> "foto1".equals(linea)).collect(Collectors.toList());
		f1 = resultados.size(); 
		frecuencias.add(f1);
		resultados = fotos.stream().filter(linea -> "foto2".equals(linea)).collect(Collectors.toList());
		f2 = resultados.size(); 
		frecuencias.add(f2);
		resultados = fotos.stream().filter(linea -> "foto3".equals(linea)).collect(Collectors.toList());
		f3 = resultados.size(); 
		frecuencias.add(f3);
		resultados = fotos.stream().filter(linea -> "foto4".equals(linea)).collect(Collectors.toList());
		f4 = resultados.size(); 
		frecuencias.add(f4);
		resultados = fotos.stream().filter(linea -> "foto5".equals(linea)).collect(Collectors.toList());
		f5 = resultados.size(); 
		frecuencias.add(f5);
		resultados = fotos.stream().filter(linea -> "foto6".equals(linea)).collect(Collectors.toList());
		f6 = resultados.size(); 
		frecuencias.add(f6);
		resultados = fotos.stream().filter(linea -> "foto7".equals(linea)).collect(Collectors.toList());
		f7 = resultados.size(); 
		frecuencias.add(f7);
		resultados = fotos.stream().filter(linea -> "foto8".equals(linea)).collect(Collectors.toList());
		f8 = resultados.size(); 
		frecuencias.add(f8);
		resultados = fotos.stream().filter(linea -> "foto9".equals(linea)).collect(Collectors.toList());
		f9 = resultados.size(); 
		frecuencias.add(f9);
		
		System.out.println("..::INFORMACION DESAFIO 6::..");
		System.out.println("ARREGLO CON REGISTROS: "+fotos);
		Collections.sort(fotos);
		filtro = fotos.stream().distinct().collect(Collectors.toList());
		System.out.println("ARREGLO FILTRADO Y ORDENADO: "+filtro);
		
		System.out.println("\n..::FRECUENCIAS::..");
		System.out.println("Foto 1: "+f1+ " likes\tFoto 2: "+f2+" likes\tFoto 3: "+f3+" likes\nFoto 4: "+f4+" likes\tFoto 5: "+f5
						  +" likes\tFoto 6: "+f6+" likes\nFoto 7: "+f7+" likes\tFoto 8: "+f8+" likes\tFoto 9: "+f9+ " likes");
		
		System.out.println("\n..::ESTADISTICAS::..");
		System.out.printf("LA FOTO CON MAS LIKES ES: %d likes",(Collections.max(frecuencias)));
		System.out.printf("\nLA FOTO CON MENOS LIKES ES: %d likes",(Collections.min(frecuencias)));
		System.out.printf("\nEL PROMEDIO DE LIKES POR FOTO ES: %.1f likes",Metodos.promedio(frecuencias));
	}
}
