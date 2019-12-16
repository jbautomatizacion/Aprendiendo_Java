package Taller03;

public class Vehiculo {

	
	public int codigo;
	public String marca;
	public String tipo;
	public int anio;
	public int kilometraje;
	
	public Vehiculo() {
	}
	
	public Vehiculo(int codigo, String marca, String tipo, int anio, int kilometraje) {
		this.codigo = codigo;
		this.marca = marca;
		this.tipo = tipo;
		this.anio = anio;
		this.kilometraje = kilometraje;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public int getKilometraje() {
		return kilometraje;
	}
	
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	public void avanzar(int kilometros) {
		this.kilometraje = this.kilometraje +100; 
	}

	@Override
	public String toString() {
		return "Vehiculo[codigo = " + codigo + ", marca = " + marca + ", tipo = " + tipo + ", anio = " + anio + ", kilometraje = " + kilometraje + "]";
	}
}
