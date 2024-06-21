package org.generation;

public class triangulo implements FiguraGeometrica {

	private String nombre;
	private double base;
	private double altura;
	private double lado;
	public triangulo(String nombre, double base, double altura, double lado) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public double calcularArea() {
		
		return base*altura/2;
	}
	@Override
	public double calcularPerimetro() {
		return lado+lado+lado;
	}
	@Override
	public String toString() {
		return "triangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}
	
	
}
