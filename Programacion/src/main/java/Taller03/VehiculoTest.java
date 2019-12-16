package Taller03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VehiculoTest {
	
		
		@Test
		public void testVehiculo1() {
		Vehiculo v1 = new Vehiculo();
		v1.setCodigo(54321);
		v1.setMarca("Ferrari");
		v1.setTipo("Deportivo");
		v1.setAnio(2010);
		v1.setKilometraje(0);

		//System.out.println(v1.toString());
		v1.avanzar(50);
		//System.out.println(v1.toString())*/;
		assertEquals(100, v1.getKilometraje());
		System.out.println("El kilometraje avanzo de 0 a " + v1.getKilometraje());
		}
		
		
		@Test
		public void TestVehiculo2() {
		Vehiculo v2 = new Vehiculo(12345, "Toyota", "Van", 2000, 72);
		//System.out.println(v2.toString());
		v2.avanzar(100);
		//System.out.println(v2.toString());
		assertEquals(172, v2.getKilometraje());
		System.out.println("El kilometraje avanzo de 72 a " + v2.getKilometraje());
		}
}
