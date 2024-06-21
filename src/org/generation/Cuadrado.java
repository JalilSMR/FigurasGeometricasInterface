package org.generation;

public class Cuadrado implements FiguraGeometrica {
	
	private double lado;
	private String Nombre;
	public Cuadrado(String Nombre, double lado ) {
		super();
		this.lado = lado;
		this.Nombre = Nombre;
		
	
	}
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", Nombre=" + Nombre + "]";
	}

	@Override
	public double calcularArea() {
		return lado*lado;
	}

	@Override
	public double calcularPerimetro() {
		return lado+lado+lado+lado;
	}
}
