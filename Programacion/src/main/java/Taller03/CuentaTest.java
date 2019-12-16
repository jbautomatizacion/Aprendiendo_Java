package Taller03;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CuentaTest {
	
	@Test
	public void a_IngresarCantidadMayoraCero() {
		Cuenta c1= new Cuenta(100);
		c1.ingresar(30);
		
		assertEquals(130, c1.getMonto(),0);
		System.out.println("El monto aumento de 100 a " + c1.getMonto() + " correctamente");
		
	}
	
	@Test
	public void b_IngresarCantidaNegativa() {
		Cuenta c2= new Cuenta(70);
		int valorNegativo = -20;
		c2.setCantidad(valorNegativo);
		c2.ingresar(valorNegativo);
		
		assertEquals(70, c2.getMonto(),0);
		System.out.println("El monto no aumento por ingresar una cantidad negativa de: " + c2.getCantidad());
	}
	
	@Test
	public void c_RetirarMenoraMonto() {
		Cuenta c3= new Cuenta(50);
		c3.retirar(30);
		
		assertEquals(20, c3.getMonto(),0);
		System.out.println("El resultado de restar Monto - Cantidad es: " +  c3.getMonto());
	}
	
	@Test
	public void d_RetirarIgualaMonto() {
		Cuenta c4= new Cuenta(87);
		c4.retirar(87);
		
		assertEquals(0, c4.getMonto(),0);
		System.out.println("El resultado de restar Monto - Cantidad(igual al monto) es: "+ c4.getMonto());
	}
	
	@Test
	public void e_RetirarMayorMonto() {
		Cuenta c5 = new Cuenta(54);
		c5.retirar(90);
		
		assertEquals(0, c5.getMonto(),0);
		System.out.println("El monto se cambio a valor 0 por retirar un valor mayor al monto :" + c5.getMonto());
	}
	
	@Test
	public void f_RetirarNegativo() {
		Cuenta c6= new Cuenta(120);
		int valorNegativo = -17;
		c6.setCantidad(valorNegativo);
		c6.ingresar(valorNegativo);
		
		assertEquals(120, c6.getMonto(),0);
		System.out.println("El monto no cambia por que se retira una cantidad negativa de: " + c6.getCantidad());
	}

}
