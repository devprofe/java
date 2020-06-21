package cl.rvasquez.colecciones2;

public class Main {

	public static void main(String[] args) {
		System.out.println("..::NOMBRES - EMAIL::..\n");
		Metodos.nombresEmails();
		System.out.println("\n\n..::ALBUMS DEL USUARIO 5::..\n");
		Metodos.albumsUsuario5();
		System.out.println("\n\n..::DETALLE ALBUM 77::..\n");
		Metodos.detalleAlbum77();
		System.out.println("\n\n..::FOTOS CON (IPSAM DO) EN EL TITULO::..\n");
		Metodos.fotosIpsam();
		System.out.println("\n\n..::2 USUARIOS y SUS RESPECTIVOS ALBUMS::..\n");
		Metodos.usuariosAlbums();
	}
}