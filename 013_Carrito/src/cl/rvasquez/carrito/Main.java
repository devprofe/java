package cl.rvasquez.carrito;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {
	private static Exportador exportador;
	public static void main(String[] args) {

		ArrayList<Articulos> ropero = new ArrayList<>();
		ArrayList<Orden> orden = new ArrayList<>();
		List<String> codigos = new ArrayList<>();
		List<String> producto = new ArrayList<>();
		List<Double> precios = new ArrayList<>();
		List<Double> pagar = new ArrayList<>();
		
		String fechaOrden = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		Scanner sc = new Scanner(System.in);
		int opc1 = 0, opc2 = 0, cuotas = 0;
		boolean sal1 = false, sal2 = false;
		String cod = null, resp = "S", con1 = null, con2 = null;
		

		ropero.add(new Zapatos("ZAP001", "Construccion", "Cat", "Tanque", 43, 39990));
		ropero.add(new Zapatos("ZAP002", "Vestir", "Guante", "Soft", 41, 54990));
		
		ropero.add(new Poleras("POL001", "Polera Pique", "Polo", 16, "Azul", 19990));
		ropero.add(new Poleras("POL002", "Polera en V", "Nike", 14, "Rojo", 14990));
		
		ropero.add(new Pantalones("PAN001", "Cargo", "Diesel", 44, "Gris", 6, 34990));
		ropero.add(new Pantalones("PAN002", "Short", "Levis", 48, "Azul", 4, 29990));
		
		

		while(!sal1) {
			System.out.println("\n\n.::MENU PRINCIPAL::..");
			System.out.println("1 - Mostrar Productos Disponibles");
			System.out.println("2 - Agregar al Carrito");
			System.out.println("3 - Pagar");
			System.out.println("4 - Salir");
			try {
				System.out.println("Ingrese Opcion: ");
				opc1 = sc.nextInt();
				switch(opc1) {
					case 1:
						System.out.println("\n\n..::ARTICULOS DISPONIBLES::..");
						for(Articulos prendas: ropero) { 
							if(prendas.getClass() == Zapatos.class) {
								System.out.println(prendas.getClass().getSimpleName()+" "+prendas.toString());
							}
							else if(prendas.getClass() == Poleras.class) {
								System.out.println(prendas.getClass().getSimpleName()+" "+prendas.toString());
							}
							else if(prendas.getClass() == Pantalones.class) {
								System.out.println(prendas.getClass().getSimpleName()+" "+prendas.toString());
							}
							else {
								System.out.println("Prenda no Existente");
							}
							codigos.add(prendas.getCodigo());
							precios.add(prendas.getPrecio());
						}
						break;
						
					case 2:
						System.out.println("\n\nAGREGAR PRODUCTO");
						System.out.println(codigos);
						while(!resp.equals("N")) {
							System.out.println("Ingrese Codigo de Articulos que desea agregar al Carrito");
							cod = sc.next();
							if(codigos.contains(cod) == true){
								pagar.add(precios.get(codigos.indexOf(cod)));
								producto.add(cod);
								System.out.printf("\n\nArticulo codigo: %s con Valor %.0f\nfue Agregado con Exito\n",cod,precios.get(codigos.indexOf(cod)));
							}
							else {
								System.out.printf("\n\nArticulo codigo: %s \nNO EXISTE EN EL CATALOGO\n",cod);
							}
							System.out.println("\n\nDesea Agregar mas Articulos al Carrito ? \nPresione S para Continuar o N para (Salir)");
							resp = sc.next();
						}
					case 3:
						while(!sal2) {
							System.out.println("\n\nCUAL ES SU MEDIO DE PAGO?");
							System.out.println("1 - Pago con Debito");
							System.out.println("2 - Pago con Credito");
							System.out.println("3 - Volver");
							try {
								System.out.println("Ingrese Opcion: ");
								opc2 = sc.nextInt();
								switch(opc2) {
									case 1:
										System.out.println("\n\nEsta Seguro que desea pagar con debito el total de $ "+Metodos.carrito(pagar));
										System.out.println("Ingrese Y para si o N para no");
										con1 = sc.next();
										if(con1.equals("Y")) {
											System.out.println("\n\nDATOS DE DESPACHO");
											orden.add(new Orden("ABC 123", "Pepe Lota", (ArrayList<String>) producto, Metodos.carrito(pagar) , fechaOrden));
											ordenCompra(orden, codigos, precios, fechaOrden);
											System.out.println(orden);
											System.out.println("..::ORDEN DE DESPACHO GENERADA CORRECTAMENTE, FORMATO XLS::..");
											break;
										}
										else {
											break;
										}
										
									case 2:
										System.out.println("\n\nEsta Seguro que desea pagar con Credito el total de $ "+Metodos.carrito(pagar));
										System.out.println("Ingrese Y para si o N para no");
										con1 = sc.next();
										System.out.println("Con Cuantas Cuotas desea Pagar? (0 - 24)");
										cuotas = sc.nextInt();
										while (cuotas < 0 || cuotas > 24) {
											System.out.println("CUOTAS INVALIDAS");
											System.out.println("Con Cuantas Cuotas desea Pagar? (0 - 24)");
											cuotas = sc.nextInt();
										}

											System.out.printf("\nEsta Seguro que desea pagar con %d cuotas?\n",cuotas);
											System.out.println("Ingrese Y para si o N para no");
											con2 = sc.next();
										
										if(con1.equals("Y") && con2.equals("Y")) {
											System.out.println("\n\nDATOS DE DESPACHO");
											orden.add(new Orden("ABC 123", "Pepe Lota", (ArrayList<String>) producto, Metodos.carrito(pagar) , fechaOrden));
											ordenCompra(orden, codigos, precios, fechaOrden);
											System.out.println(orden);
											System.out.println("..::ORDEN DE DESPACHO GENERADA CORRECTAMENTE, FORMATO XLS::..");
											break;
										}
										else {
											break;
										}
										
									case 3:
										sal2 = true;
										break;
										
									}
							}
							catch (InputMismatchException e) {
					            System.out.println("Debes Ingresar solo Caracteres Validos");
					            sc.next();
							}
						}
						break;
					case 4:
						System.out.println("HAS SALIDO DEL SISTEMA");
						sal1 = true;
						break;
						
					default:
						System.out.println("Debe Ingresar Opcion Valida ");
						break;
						
					}
				}
				catch (InputMismatchException e) {
		            System.out.println("Debes Ingresar solo Caracteres Validos");
		            sc.next();
				}
			}
		sc.close();
		
	}
	private static void ordenCompra(ArrayList<Orden> orden, List<String> producto, List<Double> pagar,	String fechaOrden) {
	
		ArrayList<String> paso = new ArrayList<>();
		StringTokenizer token = new StringTokenizer(orden.toString(),"[,]");
	
		while(token.hasMoreTokens()){
		    paso.add(token.nextToken().trim());
		}
		
		if(null == orden || orden.size() == 0) {
			System.out.println("....");
		}
		else {
			try {
				ArrayList<Object> lista = new ArrayList<Object>();
				lista.add("Orden de Despacho");
				for(String datos : paso) {
					lista.add(datos);
				}
	
				if(LectorConfiguracion.formatoSalida().equals("xls")) {
					exportador = new ExportadorExcel();
				}
				else {
					System.out.println("Solo se puede exportar a Excel .xls");
				}
				exportador.exportar(lista);
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}