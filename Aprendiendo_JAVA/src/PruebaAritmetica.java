
public class PruebaAritmetica {
	
	public static void  main(String args[]) {
		
		//Creamos un bojeto de la clase aritmetica
		Aritmetica obj1 = new Aritmetica();
		
		//LLamamos el metodo sumar y recibimos el valor devuelto
		int resultado = obj1.sumar(5, 4);
		
		System.out.println("Resultado suma directa obj1: " + resultado);
		
		System.out.println("Resultado suma atributo obj1: " + obj1.sumar());
		
		//Ahora creamos un objeto con el constructor con 2 argumentos
		Aritmetica obj2 = new Aritmetica(3,1);
		System.out.println("\nResultado suma atributos obj2: " + obj2.sumar());
	}

}
