package cl.rvasquez.biblioteca;

public class Enlace {
	private static Enlace singleton;
	private Enlace() {
		
	}
	public static Enlace getSingle() {
		if(singleton == null) {
			synchronized(Enlace.class) {
				singleton = new Enlace();
			}
		}
		return singleton;
	}
}