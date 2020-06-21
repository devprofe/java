import java.util.Scanner;
public class Fechas {
	public static void main(String...args) {
		String fecha1; String fecha2;
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese 1º fecha DD/MM/AAAA");
		fecha1 = in.nextLine();
		int dia1 = Integer.parseInt(fecha1.substring(0,2));
		int mes1 = Integer.parseInt(fecha1.substring(3,5));
		int anio1 = Integer.parseInt(fecha1.substring(6));
		System.out.println("Ingrese 2º fecha DD/MM/AAAA");
		fecha2 = in.nextLine();
		int dia2 = Integer.parseInt(fecha2.substring(0,2));
		int mes2 = Integer.parseInt(fecha2.substring(3,5));
		int anio2 = Integer.parseInt(fecha2.substring(6));
		if(anio1 == anio2 && mes1 == mes2 && dia1 == dia2) {
			System.out.println("Tienen la misma edad");
		}
		else if(anio1 < anio2) {
				System.out.println("Persona 1 es Mayor");
		}
		else if(anio1 == anio2 && mes1 < mes2) {
				System.out.println("Persona 1 es Mayor");
		}
		else if(mes1 == mes2 && dia1 < dia2) {
				System.out.println("Persona 1 es Mayor");
		}
		else{
			System.out.println("Persona 2 es Mayor");
		}
	}
}