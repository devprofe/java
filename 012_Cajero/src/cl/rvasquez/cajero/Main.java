package cl.rvasquez.cajero;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) throws ParseException {
		ArrayList<Clientes> listado = new ArrayList<Clientes>();
		Clientes cliente1 = new Clientes("11", "Juan Perez", "+56912345678", "juan@perez.cl", 1234, Metodos.IngresaFechas("05-ENE-2000"));
		listado.add(cliente1);
		Ejecutivos ejecutivo1 = new Ejecutivos("22", "Peter Pan", "+56987654321", "peter@pan.cl", "Stgo Centro", "+56221234567", "Estado 123");
		CuentasCorrientes cuentacorriente1 = new CuentasCorrientes(100000, "00-123", 15000, 10000);
		TarjetasCredito tarjetacredito1 = new TarjetasCredito(150000, "01-123", 50000, 200000, 65000);
		Scanner sc = new Scanner(System.in);
		String rut; 
		int clave;
		int edad = Metodos.CalculoEdad(cliente1.getFechaNacto());
        boolean salir = false;
        int opcion, op1, op2;
		System.out.println("Ingrese su rut sin dv, sin puntos ni guion");
		rut = sc.next();
		System.out.println("Ingrese su clave");
		clave = sc.nextInt();
		if(rut.equals(cliente1.getRut()) && clave == cliente1.getClave()) {
		while (!salir) {
        	System.out.printf("\nBienvenido %s (%s Años)",cliente1.getNombre(),edad);
            System.out.println("\nQue deseas hacer?");
        	System.out.println("1. Menu Cuenta Corriente");
            System.out.println("2. Menu Tarjeta de Credito");
            System.out.println("3. Ver datos de mi ejecutivo");
            System.out.println("4. Salir");
 
            try {

                System.out.println("Ingrese una Opcion");
                opcion = sc.nextInt();
 
                switch (opcion) {
                    case 1:
                    	System.out.println("Cuenta Corriente : "+cuentacorriente1.getNroProducto());
                		System.out.printf("Saldo Actual: $%d ",cuentacorriente1.getSaldoDisponible());
                		System.out.printf("\nLa deuda de su cuenta: $%d ",cuentacorriente1.getDeudaMensual());
                    	System.out.println("\nQue desea hacer ?");
                        System.out.println("1. Volver al Menu");
                        System.out.println("2. Retirar Dinero");
                        System.out.println("3. Pagar mi deuda");
                        System.out.println("Ingrese una Opcion");
                       
                        op1 = sc.nextInt();
                        switch(op1) {
                        
	                        case 1:
	                        	System.out.println("\n********************************************");
	                        	break;
	                    
		                    case 2:
		                		int giro;
		                		System.out.println("\nCuanto desea Girar ?");
		                		giro = sc.nextInt();
		                		int saldoActual = Metodos.RetiroDinero(cuentacorriente1.getSaldoDisponible(),giro);
		                		if(giro > saldoActual) {
		                			System.out.println("NO PUEDE EXCEDER DEL SALDO DISPONIBLE");
		                			}
		                		else {
		                			System.out.printf("Su giro es de: $%d ",giro);
		                			cuentacorriente1.setSaldoDisponible(saldoActual);
		                			System.out.printf("\nSu nuevo saldo es: $%d ",cuentacorriente1.getSaldoDisponible());
		                			}
		                		System.out.println("\n********************************************");
		                    	break;
		                  
				            case 3:
				            	int deuda = cuentacorriente1.getDeudaMensual();
				        		System.out.println("Su deuda actual es: "+deuda);
				        		System.out.println("Cuanto desea Abonar a su deuda: ");
				        		int abono;
				        		abono = sc.nextInt();
				        		int pago = Metodos.PagarDeuda(abono, deuda);
				        		cuentacorriente1.setDeudaMensual(pago);
				        		if (abono <= deuda) {
				        			System.out.println("Su Nueva deuda es: "+cuentacorriente1.getDeudaMensual());
				        		}
				        		else {
				        			System.out.println("ABONO EXCEDE DEUDA");
				        		}
				        		if(pago == 0) {
				        			System.out.println("SU DEUDA HA SIDO CANCELADA\nNO TIENES DEUDA");
				        		}
		                		System.out.println("\n********************************************");
				            	break;
				            	
				            	
	        				default:
	        					System.out.println("Solo números entre 1 y 3");
		                		System.out.println("\n********************************************");
		                		break;
	                        }
                    case 2:
                		int saldod = tarjetacredito1.getSaldoDisponible();
                		int saldoa = tarjetacredito1.getSaldoAdeudado();
                		int deudaTar = Metodos.DeudaTarjeta(saldod, saldoa);
                		int pagoTar = Metodos.PagarDeuda(deudaTar);
                		System.out.println("Tarjeta de Credito: "+tarjetacredito1.getNroProducto());
                		System.out.println("Saldo Actual: "+saldod+" / "+saldoa);
                		System.out.println("La deuda de su tarjeta es: "+deudaTar);
                		System.out.println("1. Volver al Menu");
                		System.out.println("2. Pagar la Deuda");
                		
                		op2 = sc.nextInt();
                        switch(op2) {
	                        case 1:
		                		System.out.println("\n********************************************");
	                        	break;
	                        	
	                        case 2:
	                        	System.out.println("DEUDA CANCELADA");
				        		tarjetacredito1.setDeudaTotal(pagoTar);
	                    		System.out.println("Su deuda actual es: "+tarjetacredito1.getDeudaTotal());
		                		System.out.println("\n********************************************");
	                    		break;
	                        	
	        				default:
	        					System.out.println("Solo números entre 1 y 2");
		                		System.out.println("\n********************************************");
	        					break;
                        }
                    case 3:
                        System.out.println("Datos de tu Ejecutivo");
                        System.out.printf("Nombre: %s, telefono: %s, Direccion: %s",ejecutivo1.getNombre(),
                        				ejecutivo1.getDireccionSucursal(), ejecutivo1.getTelefonoSucursal());
                		System.out.println("\n********************************************");
                        break;
                        
                    case 4:
                        salir = true;
                		System.out.println("\n********************************************");
                        break;
                        
                    default:
                        System.out.println("Solo números entre 1 y 4");
                		System.out.println("\n********************************************");
                	}
                op2 = 0;
            	} 
            	catch (InputMismatchException e) {
	                System.out.println("Debes Ingresar Solo Numeros");
	                sc.next();
            	}
    		}
			System.out.println("\nCerrando Sesion Hasta Luego "+cliente1.getNombre());
        	sc.close();
        }
		else {
			System.out.println("ACCESO DENEGADO, RUT o CLAVE MAL INGRESADOS");
		}
	}
}