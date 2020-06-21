import java.util.Scanner;
public class SumaImparLimite {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);
		int min = 0; int max = 0; int suma = 0;
		System.out.println("Ingrese MIN: ");
		min = in.nextInt();
		System.out.println("Ingrese MAX: ");
		max = in.nextInt();
		while(max > min) {
			min++;
			if(min % 2 != 0) {
				suma = suma + min;
			}
			
		}
		System.out.println("LA SUMA ES: "+suma);
		in.close();
	}
}
