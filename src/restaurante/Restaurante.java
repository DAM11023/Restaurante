package restaurante;
/**
 * La calse Restaurante gestiona los comensales del restaurante
 * 
 * @author dam110
 * @version 1.0.0
 * @since 11/01/2023
 *
 */
public class Restaurante {
	/** Representa el numero de patatas */
	private int patatas;
	/** representa el numero de calamares */
	private int calamares;
	
	private static Restaurante MiRestaurante;

	/** 
	 * Constructor de la clase Restaurante 	 
	 * @param Indica el numero de patatas que hay en el stock
	 * @param Indica el numero de calamares que hay en el stock
	 */
	public Restaurante(int a, int b) {
		this.setPatatas(a);
		this.setCalamares(b);
	}
/**
 * Metodo por el que se conoce el numero minimo de comensales en funcion del numero de patatas en stock
 * @return Devuelve el numero de comensales
 */
	int cantP() {
		int a = this.getPatatas() * 3;
		return a;
	}

	int cantC() {
		int ch = this.getCalamares() * 6;
		return ch;
	}
	public void addCalamares(int c) {
		this.setCalamares(this.getCalamares() + c);
	}

	public void addPatatas(int d) {
		this.setPatatas(this.getPatatas() + d);
	}

	public static void main(String[] args) {
		MiRestaurante = new Restaurante(50, 60);
		System.out.println("Cantidad de calamares: " + MiRestaurante.getCalamares());
		System.out.println("Cantidad de patatas: " + MiRestaurante.getPatatas());
		calculaComensales(MiRestaurante);
		MiRestaurante.addCalamares(1);
		MiRestaurante.addPatatas(80);
		System.out.println("\nPedido Recibido!! Stock actual: ");
		System.out.println(MiRestaurante.getPatatas() + " patatas.\n" + MiRestaurante.getCalamares() + " calamares");
		calculaComensales(MiRestaurante);
	}

	private static void calculaComensales(Restaurante r1) {
		if (r1.cantP() <= r1.cantC()) {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantP() + " personas con raciones de patatas máximo");
		} else {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantC() + " personas con raciones de calamares máximo");
		}
	}

	public int getPatatas() {
		return patatas;
	}

	public void setPatatas(int patatas) {
		this.patatas = patatas;
	}

	public int getCalamares() {
		return calamares;
	}

	public void setCalamares(int calamares) {
		this.calamares = calamares;
	}
}