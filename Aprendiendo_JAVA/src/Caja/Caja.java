package Caja;

public class Caja {

	private int ancho;
	private int alto;
	private int profundo;
	
	public Caja() {}
	
	public Caja(int ancho, int alto, int profundo) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundo = profundo;
	}
	
	public int calcularVolumen() {
		//int volumen;
		return ancho * alto * profundo;
		//return volumen;
	}
	
	public int calcularVolumen(int ancho, int alto, int profundo) {
		return ancho * alto * profundo;
	}
	
}
