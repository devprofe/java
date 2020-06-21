import java.util.Scanner;
public class Main {
	public static void main(String...args) {
		Scanner in = new Scanner(System.in);
		int tope = 0;
		System.out.println("Ingrese Tope de Patron: ");
		tope = in.nextInt();
		System.out.println("..::SIMPLES::..");
		System.out.println("SIMPLE 1");
		Patrones.Simple1(tope);
		System.out.println("\nSIMPLE 2");
		Patrones.Simple2(tope);
		System.out.println("\nSIMPLE 3");
		Patrones.Simple3(tope);
		System.out.println("\n\n..::ANIDADOS::..");
		System.out.println("\nANIDADO 1");
		Patrones.Anidado1(tope);
		System.out.println("\nANIDADO 2");
		Patrones.Anidado2(tope);
		System.out.println("\nANIDADO 3");
		Patrones.Anidado3(tope);
		System.out.println("\nANIDADO 4");
		Patrones.Anidado4(tope);
		in.close();
	}
}
