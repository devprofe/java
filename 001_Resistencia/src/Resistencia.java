import java.util.Scanner;
public class Resistencia{
	public static void main(String...args) {
		float r1; float r2; float r3; float rt = 0.0f;
		Scanner in = new Scanner(System.in);
		System.out.println("CALCULO DE RESISTENCIA TOTAL\n");
		System.out.println("Ingrese Resistencia 1: ");
		r1 = in.nextFloat();
		System.out.println("Ingrese Resistencia 2: ");
		r2 = in.nextFloat();
		System.out.println("Ingrese Resistencia 3: ");
		r3 = in.nextFloat();
		if(r1 != 0 && r2 != 0 && r3 != 0) {
			rt = 1/((1/r1)+(1/r2)+(1/r3));
			System.out.println("La Resistencia Total es: "+rt+" Ohms");
		}
		else {
			System.out.println("Las Resistencias no son distintas de cero");
		}

		in.close();	
	}
}