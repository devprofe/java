import java.util.Scanner;
public class SumaImpar {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);
		int x = 0; int n = 0; int suma = 0;
		System.out.println("Tope de Valores: ");
		n = in.nextInt();
		do {
			x++;
			if(x % 2 != 0) {
				suma = suma + x;
			}
		}while(n > x);
		System.out.println("SUMA DE IMPARES: "+suma);
		in.close();
	}
}