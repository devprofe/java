import java.util.Scanner;
public class Rectangulo {
	public static void main(String...args) {
		int altura; int largo; int area; int perimetro;
		float x; float sarea = 0.0f; float sperimetro = 0.0f;
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese Altura: ");
		altura = in.nextInt();
		System.out.println("Ingrese Largo: ");
		largo = in.nextInt();
		System.out.println("Ingrese Valor de X: ");
		x = in.nextFloat();
		area = altura * largo;
		perimetro = (altura * 2) + (largo * 2);
		System.out.println("Area del Rectangulo: "+area);
		System.out.println("Perimetro del Rectangulo: "+perimetro);
		if(x < altura && x < largo) {
			sarea = (altura - x) * (largo - x);
			sperimetro = ((altura - x) * 2) + ((largo - x) * 2);
			System.out.println("Area del Subrectangulo: "+sarea);
			System.out.println("Perimetro del Subrectangulo: "+sperimetro);
		}	
		else {
			System.out.println("El valor de X, no debe pasar alto ni largo");
		}
		in.close();
	}
}