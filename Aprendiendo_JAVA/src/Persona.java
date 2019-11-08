
public class Persona {
	
	//Atributos de la clase
	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	
	//Metodos de la clase
	//Los usaran los objetos de esta clase
	public void desplegarNombre() {
		System.out.println("Nomre :" + nombre);
		System.out.println("Apellido Paterno :" +apellidoPaterno);
		System.out.println("Apelido Materno :" + apellidoMaterno);
	}
	
	int sumar(int a, int b) {
		return a+b;
	}

}
