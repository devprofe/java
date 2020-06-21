package cl.rvasquez.colecciones2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class Metodos {
	public static void nombresEmails() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com/").path("users");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaUsuarios = invocationBuilder.get();
		List<Usuario> listaUsuarios = respuestaUsuarios.readEntity(new GenericType<List<Usuario>>(){});
		for (Usuario datosUsuarios: listaUsuarios)
			  System.out.println(datosUsuarios.getName()+" - "+datosUsuarios.getEmail());
	}
	public static void albumsUsuario5() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com/").path("albums");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaAlbums = invocationBuilder.get();
		List<Album> listaAlbums = respuestaAlbums.readEntity(new GenericType<List<Album>>(){});
		for (Album datosAlbums: listaAlbums)
			if(datosAlbums.getUserId().equals("5"))
			  System.out.println(datosAlbums.getId()+" - "+datosAlbums.getUserId()+" - "+datosAlbums.getTitle());
	}

	public static void detalleAlbum77() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com/albums/77");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaAlbums = invocationBuilder.get();
		Album AlbumIndividual = respuestaAlbums.readEntity(Album.class);
		System.out.println(AlbumIndividual.getId()+"\n"+AlbumIndividual.getUserId()+"\n"+AlbumIndividual.getTitle());
	}

	public static void fotosIpsam() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com/").path("photos");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaFotos = invocationBuilder.get();
		List<Foto> listaFotos = respuestaFotos.readEntity(new GenericType<List<Foto>>(){});
		List<String> fotosOrden = new ArrayList<String>();
		for (Foto datosFotos: listaFotos)
			if(datosFotos.getTitle().contains("ipsam do")) {
				fotosOrden.add(datosFotos.getTitle());
			}
		Collections.sort(fotosOrden);
		for(String ordenado : fotosOrden)
			System.out.println(ordenado);
	}
	public static void usuariosAlbums() {
		Client clientU = ClientBuilder.newClient();
		WebTarget targetU = clientU.target("https://jsonplaceholder.typicode.com/").path("users");
		Invocation.Builder invocationBuilderU = targetU.request(MediaType.APPLICATION_JSON);
		Response respuestaUsuarios = invocationBuilderU.get();
		
		Client clientA = ClientBuilder.newClient();
		WebTarget targetA = clientA.target("https://jsonplaceholder.typicode.com/").path("albums");
		Invocation.Builder invocationBuilderA = targetA.request(MediaType.APPLICATION_JSON);
		Response respuestaAlbums = invocationBuilderA.get();
		
		List<Usuario> listaUsuarios = respuestaUsuarios.readEntity(new GenericType<List<Usuario>>(){});
		List<Album> listaAlbums = respuestaAlbums.readEntity(new GenericType<List<Album>>(){});
		Map<Integer, String> mapaDatos = new HashMap<Integer, String>();
		List <String> pase = new ArrayList<String>();
		String pase1 = "", pase2 = "", pase3 = "";
		
		for(Album mapaAlbums : listaAlbums) {
				if(mapaAlbums.getUserId().equals(listaUsuarios.get(0).getId().toString())) {
					pase1 = mapaAlbums.getTitle() +", "+pase1;
				}
				if(mapaAlbums.getUserId().equals(listaUsuarios.get(1).getId().toString())) {
					pase2 = mapaAlbums.getTitle() +", "+pase2;
				}
				if(mapaAlbums.getUserId().equals(listaUsuarios.get(2).getId().toString())) {
					pase3 = mapaAlbums.getTitle() +", "+pase3;
				}
		}
		pase.add(pase1); pase.add(pase2); pase.add(pase3);
		
		for(int x=0;x<pase.size();x++){
			mapaDatos.put(listaAlbums.get(x).getId(), pase.get(x));
		}
			
		for (Usuario datosUsuarios: listaUsuarios){
			for (Album datosAlbums: listaAlbums) {
				if(datosUsuarios.getId().toString().equals(datosAlbums.getUserId()) && datosUsuarios.getId() <= 2) {
					System.out.printf("id usuario: %s - nombre usuario: %s | album id%s - album %s\n", datosUsuarios.getId(),
				  					datosUsuarios.getName(),datosAlbums.getUserId(),datosAlbums.getTitle());
			  	}
			}
		}
		System.out.println("\n\n..::MAPA CON USUARIO ID COMO CLAVE y TITULOS COMO COLECCION (MAPA)::.:\n");
//		FORMA CON FOREACH		
//		for (Entry<Integer, String> verMapa : mapaDatos.entrySet()){
//			Integer clave = verMapa.getKey();
//			String valor = verMapa.getValue();
//			System.out.printf("album: %d - titulos [%s]\n",clave,valor);
		
//		FORMA CON ITERADOR
		Iterator<Integer> it = mapaDatos.keySet().iterator();
		while(it.hasNext()){
		  Integer clave = (Integer) it.next();
		  String valor = mapaDatos.get(clave);
		  System.out.printf("album: %d - titulos [%s]\n",clave,valor);
		}
	}
}