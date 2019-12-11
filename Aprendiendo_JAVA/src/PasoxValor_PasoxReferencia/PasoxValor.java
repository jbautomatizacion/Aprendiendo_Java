package PasoxValor_PasoxReferencia;

public class PasoxValor {
	
	public static void main(String[] args) {
		
		int x = 10;
		imprimir(x); //imprime 10
		cambiarValor(x);
		imprimir(x);//imprime 10
		
	}
	
	public static void cambiarValor(int i) {
		i = 200;
	}
	
	public static void imprimir(int arg) {
		System.out.println("Valor recibido:" + arg);
	}

}
