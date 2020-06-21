import java.util.Scanner;
public class SoloPares {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);
		int n; int x = 0; int p = 0; int pares = 0;
		System.out.println("Tope de Pares: ");
		n = in.nextInt();
		while(n > x){
			if(pares % 2 == 0) {
				pares = x * 2;
				System.out.println(pares);
				x++;
			}
		}
		in.close();
	}
}