import java.util.Scanner;
public class Fibonacci {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);
		int f0  = 0; int f1 = 1; int fn = 0;
		int x = 0 ; int tope = 0;
		System.out.println("Ingrese Tope: ");
		tope = in.nextInt();
		do{
			System.out.println(fn);
			f0 = f1;
			f1 = fn;
			fn = f0 + f1;
			x++;
		}while(tope > x);
		in.close();
	}
}
