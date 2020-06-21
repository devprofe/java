package cl.rvasquez.biblioteca;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
	
	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		ArrayList<Medios> lista = new ArrayList<Medios>();
		boolean salir = false;
		String nombreArticulo = null;;
		Enlace sin = null;
		filtrarUsuario(sc);
		while(salir == false) {
			System.out.println("..:MENU:..");
			System.out.println("1- Reservar un artículo");
			System.out.println("2- Buscar artículo");
			System.out.println("0- Salir");
			String opcion = sc.nextLine();
			if(opcion.compareTo("1") == 0) {
				
				if(nombreArticulo != null) {
					if(reservarArticulo(lista, sc, sin) == false) {
					}
					else {
						System.out.println("Excel no actualizado, volviendo al Menú principal...");
					}
				}
				else {
					System.out.println("Debe escoger un artículo antes de reservar...");
				}
						
			}else if(opcion.compareTo("2") == 0) {
				System.out.println("Ingrese nombre del artículo para buscarlo en la lista");
				nombreArticulo = sc.nextLine();
				lista = buscarArticulo(nombreArticulo);
				for(Medios a : lista) {
					System.out.println(a.toString());
				}
				
			}
			else {
				System.out.println("<<< Vuelva pronto >>>");
				System.exit(0);
			}
		}
	}

	public static void filtrarUsuario(Scanner sc) throws IOException {
		
		System.out.println("Ingrese su nombre de usuario:");
		String nombreUsuario = sc.nextLine();
		System.out.println("Ingrese su clave de acceso:");
		String clave = sc.nextLine();
		boolean acceso = false;
		
		File f = new File("usuarios.xlsx");
		FileInputStream inputStream = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = (XSSFSheet) wb.getSheet("Hoja1");
		
		for (Row row: sheet) {
			if(row.getCell(0).getStringCellValue().compareToIgnoreCase(nombreUsuario) == 0
			&& row.getCell(1).getStringCellValue().compareTo(clave) == 0) {
				System.out.println("Bienvenido " + nombreUsuario);
				acceso = true;
			}
		}
		
		if(acceso == false) {
			System.out.println("<<< Usuario o clave incorrectos >>>");
			wb.close();
			System.exit(0);
		}
		wb.close();
	}
	

	public static ArrayList<Medios> buscarArticulo(String nombreArticulo) throws IOException {

		ArrayList <Cell> lp = new ArrayList <Cell>();
		ArrayList <Cell> ll = new ArrayList <Cell>();
		ArrayList<Medios> articles = new ArrayList<Medios>();
		

		File f = new File("datos.xlsx");
		FileInputStream inputStream = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = (XSSFSheet)wb.getSheetAt(0);
		
		for (Row row: sheet) {
			if(row.getCell(0).getStringCellValue().compareToIgnoreCase(nombreArticulo) == 0
				&& row.getCell(1).getStringCellValue().substring(0,2).compareToIgnoreCase("cx") == 0) {
				for(Cell cell : row) {
					lp.add(cell);
				} 
				articles.add(new Peliculas(
						lp.get(0).getStringCellValue(),
						lp.get(1).getStringCellValue(),
						lp.get(7).getBooleanCellValue(),
						(int)lp.get(2).getNumericCellValue(),
						(int)lp.get(3).getNumericCellValue(),
						lp.get(4).getStringCellValue()
						));
	
				}
			else if(row.getCell(0).getStringCellValue().compareToIgnoreCase(nombreArticulo) == 0
					&& row.getCell(1).getStringCellValue().substring(0,2).compareToIgnoreCase("ly") == 0) {
				for(Cell cell : row) {
					ll.add(cell);
				} 
				articles.add(new Libros(
						ll.get(0).getRichStringCellValue().getString(),
						ll.get(1).getRichStringCellValue().getString(),
						ll.get(7).getBooleanCellValue(),
						(int)ll.get(2).getNumericCellValue(),
						(int)ll.get(5).getNumericCellValue(),
						ll.get(6).getRichStringCellValue().getString()
						));
			}
		}
		wb.close();
		return articles;
	}
	
	public static boolean reservarArticulo(ArrayList<Medios> articles, Scanner sc, Enlace sin) throws IOException {
		boolean articuloReservado = false;
		System.out.println("Ingrese el código del artículo que desea reservar:");
		String codigo = sc.nextLine();
		for(Medios a : articles) {
			if(codigo.compareToIgnoreCase(a.getCodigo()) == 0) {
				if(a.isReserva() == false) { 
					if(sin == null) {
						articuloReservado = false;
						System.out.println("El artículo se encuentra disponible!!, Reservando " + a.getNombre() + " [código: " + a.getCodigo() + "]...");
						sin = actualizaReserva(a);
					}else {
						System.out.println("Instancia ya fue creada");
					}
						
				}
				else {
					articuloReservado = true; 
					System.out.println("<< Artículo no disponible para reserva >>");
				}
			}
		}
		return articuloReservado;
	}

	public static Enlace actualizaReserva(Medios a) throws IOException {
		
		Enlace sin = Enlace.getSingle();
		File file = new File("articulitos.xlsx");
		FileInputStream inputStream = new FileInputStream(file); 
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = (XSSFSheet) wb.getSheetAt(0);
	
		int n = 0;
		for (Row row: sheet) {
			if(row.getCell(1).getStringCellValue().compareToIgnoreCase(a.getCodigo()) == 0) {
				n = row.getRowNum();
			}
		}
		
		XSSFRow row = sheet.createRow(n);
		
		if(a.getCodigo().substring(0, 2).compareToIgnoreCase("cx") == 0) {
			Peliculas p = (Peliculas) a;
			p.setReserva(true);
			
			for(int i = 0; i <= 7; i++) {
				Cell cell = row.createCell(i);
				
				switch (i) {
				case 0:
					cell.setCellValue(p.getNombre());
					break;
				case 1:
					cell.setCellValue(p.getCodigo());
					break;
				case 2:
					cell.setCellValue(p.getPlazoMaximo());
					break;
				case 3:
					cell.setCellValue(p.getDuracion());
					break;
				case 4:
					cell.setCellValue(p.getCalidad());
					break;
				case 7:
					cell.setCellValue(p.isReserva());
					break;
				default:
					cell.setCellValue("-");
				}
			}
			
			
		}else if(a.getCodigo().substring(0, 2).compareToIgnoreCase("ly") == 0) {
			Libros l = (Libros) a;
			l.setReserva(true);
			
			for(int i = 0; i <= 7; i++) {
				Cell cell = row.createCell(i);
				
				switch (i) {
				case 0:
					cell.setCellValue(l.getNombre());
					break;
				case 1:
					cell.setCellValue(l.getCodigo());
					break;
				case 2:
					cell.setCellValue(l.getPlazoMaximo());
					break;
				case 5:
					cell.setCellValue(l.getPaginas());
					break;
				case 6:
					cell.setCellValue(l.getImprenta());
					break;
				case 7:
					cell.setCellValue(l.isReserva());
					break;
				default:
					cell.setCellValue("-");
				}
			}
			
		}
			FileOutputStream outFile = new FileOutputStream(new File("datos.xlsx"));
			wb.write(outFile);
			outFile.flush();
			outFile.close();
			wb.close();
			inputStream.close();
			
			return sin;
	}
}
