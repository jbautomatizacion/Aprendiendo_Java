
public class Aritmetica {
	
	//Atributos de la clase
	int a;
	int b;
	
	//Constructor vacio
	Aritmetica(){
		
	}
	
	//Constructor con 2 argumentos
	Aritmetica(int arg1, int arg2){
		a = arg1;
		b = arg2;
	}
	
	//Este metodo toma nuevos valores
	int sumar (int a, int b) {
		return a + b;
	}
	
	//Este metodo toma los atributos de la clase
	int sumar() {
		return a + b;
	}

}
