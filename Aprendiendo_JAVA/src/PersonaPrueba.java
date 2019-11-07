
public class PersonaPrueba {

	public static void main(String args[]) {
		
	//Creacion de un objeto
	Persona p1 = new Persona();
	
	//Llamando a un metodo de objeto creado
	System.out.println("Valores por default de objeto persona");
	p1.desplegarNombre();
	
	//Modificar valores
	p1.nombre = "Juan";
	p1.apellidoPaterno = "Esparza";
	p1.apellidoMaterno = "Lara";
	
	//Volvemos a llamar al metodo
	System.out.println("\nNuevos valores del objeto Persona");
	p1.desplegarNombre();
	}
}
