package Taller03;

public class Cuenta {
	
	public double cantidad;
	public double monto;
	
	public Cuenta() {}
	
	public Cuenta(double monto) {
		this.monto = monto;
	}
	
	public Cuenta(double cantidad, double monto) {
		this.cantidad = cantidad;
		this.monto = monto;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getMonto() {
		return monto;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			this.monto = this.monto + cantidad;
		}
	}
	
	public void retirar(double cantidad) {
		if (cantidad <= this.monto) {
			this.monto = this.monto - cantidad;
		} else if(cantidad > this.monto) {
			this.monto = 0;
		} else if (cantidad < 0) {
			this.monto = monto;
		}
	}
	
	@Override
	public String toString() {
		return "Cantidad[cantidad = " + cantidad + ", monto = " + monto + "]";
	}
	

}
