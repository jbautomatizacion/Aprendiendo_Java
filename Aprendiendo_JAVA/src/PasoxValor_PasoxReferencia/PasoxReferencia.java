package PasoxValor_PasoxReferencia;

public class PasoxReferencia {
	
	public static void main(String args[]) {
		
		Persona p = new Persona();
		p.cambiarNombre("Juan");
		imprimirNombre(p);
		modificarPersona(p);
		imprimirNombre(p);
		
	} 
	
	public static void modificarPersona(Persona arg) {
		arg.cambiarNombre("Carlos");
	}

	public static void imprimirNombre(Persona p) {
		System.out.println("Valore recibido: " + p.obtenerNombre());
	}
}
