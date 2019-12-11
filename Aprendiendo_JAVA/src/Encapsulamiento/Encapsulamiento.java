package Encapsulamiento;

public class Encapsulamiento {
	
	public static void main(String args[]) {
		
		//Creamos el objeto
		Persona p1 = new Persona("Juan", "Perez", false);
		//Accedemos al atributo nombre
		System.out.println("Nombre de p1: " + p1.getNombre());
		
		//Creamos el objeto
		Persona p2 = new Persona("Karla","Gonzales",false);
		//Imprimimos el estado de objeto
		System.out.println("Estado objeto p2: " + p2);
		
		//Marcamos como eliminada a la persona
		p2.setBorrado(true);
		//Imprimimos le estado completo de objeto
		System.out.println("Estado objeto p2: " + p2);
		
		//Creamo el tercer objeto
		Persona p3 = new Persona();
		//Imprimimos le estado completo del objeto
		System.out.println("Estado objeto p3: " + p3);
	}

}
