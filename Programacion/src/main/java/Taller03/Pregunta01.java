package Taller03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Pregunta01 {

public static void main(String[] args) {
		
		Scanner scannerTeclado = new Scanner(System.in);
		int numero = 0;
		ArrayList<Integer> arregloNumeros = new ArrayList<Integer>();
		do {
			System.out.println("Introduzca un número {digita -1 para finalizar}: ");
			numero = scannerTeclado.nextInt();
			if (numero > 0) {
				arregloNumeros.add(numero);
				//System.out.println(numero);
			}
		} while(numero > 0);
		
		scannerTeclado.close();
		
		Iterator<Integer> iteratorNumeros = arregloNumeros.iterator();
		System.out.println("\nLos números ingresados son:");
		while(iteratorNumeros.hasNext()) {
			int valorArreglo = iteratorNumeros.next();
			System.out.println(valorArreglo);
		}
		
		
		Integer sum = 0;
		System.out.println("\nLa suma total es:");
		for(int i = 0; i < arregloNumeros.size(); i++)
		    sum += arregloNumeros.get(i);
		System.out.println(sum);
		
		}
	}